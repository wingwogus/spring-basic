package hello.core.member;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

public class Member {

    @Getter
    private Long id;
    @Getter
    private String name;
    @Setter @Getter
    private Grade grade;

    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

}
