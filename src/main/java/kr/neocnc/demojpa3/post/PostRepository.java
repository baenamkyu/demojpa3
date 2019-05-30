package kr.neocnc.demojpa3.post;

import kr.neocnc.demojpa3.MyRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends MyRepository<Post, Long> {
}
