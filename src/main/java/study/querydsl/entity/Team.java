package study.querydsl.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(onlyExplicitlyIncluded = true)
public class Team {

    @Id
    @GeneratedValue
    @ToString.Include
    private Long id;

    @ToString.Include
    private String name;

    @OneToMany(mappedBy = "team")
    @ToString.Exclude
    List<Member> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }
}
