package com.example.security;

import com.example.security.domain.Member;
import com.example.security.domain.Role;
import com.example.security.repository.MemberRepository;
import lombok.extern.java.Log;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log
@Commit
public class MemberTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void testInsert() {
        for (int i = 0; i < 100; i++) {
            Member member = new Member();
            member.setUrid("user" + i);
            member.setPassword("pwd" + i);
            member.setUsername("사용자" + i);

            Role role = new Role();
            if (i <= 80) {
                role.setRoleName("BASIC");
            } else if (i <= 90) {
                role.setRoleName("MANAGER");
            } else {
                role.setRoleName("ADMIN");
            }

            member.setRoleList(Arrays.asList(role));
            memberRepository.save(member);
        }
    }
}
