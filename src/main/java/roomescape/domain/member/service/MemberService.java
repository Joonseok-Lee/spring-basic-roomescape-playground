package roomescape.domain.member.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import roomescape.domain.member.entity.Member;
import roomescape.domain.member.repository.MemberRepository;
import roomescape.global.exception.ConflictException;

import java.util.Map;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Transactional
    public Member createMember(String nickname, String email, String password) {

        if (memberRepository.existsByNicknameOrEmail(nickname, email)) {
            throw new ConflictException(null, Map.of("email", email, "nickname", nickname), "이미 가입된 정보입니다.");
        }

        return memberRepository.save(new Member(nickname, email, password, "USER"));
    }
}
