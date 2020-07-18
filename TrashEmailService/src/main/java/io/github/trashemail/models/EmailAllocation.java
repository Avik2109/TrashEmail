package io.github.trashemail.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Table(name="email_allocated")
@Entity
public class EmailAllocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String emailId;
    private String forwardsTo;
    private Boolean isActive;

    private String source;
    private String destination;

    @CreationTimestamp
    private LocalDateTime createDateTime;
}
