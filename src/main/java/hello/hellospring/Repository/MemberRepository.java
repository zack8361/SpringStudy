package hello.hellospring.Repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

/**
 * 선언부 와 구현부로 나뉘는데 여기는 선언부이다.
 */
public interface MemberRepository {

//    저장 하는기능
    Member save(Member member);

//    아이디 가지고 찾는기능
    Optional<Member> findById(Long id);

//    이름 가지고 찾는 기능
    Optional<Member> findByName(String name);

//    전체 리스트 뽑는 기능.
    List<Member> findAll();
}
