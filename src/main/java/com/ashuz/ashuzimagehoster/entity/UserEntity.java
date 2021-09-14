package com.ashuz.ashuzimagehoster.entity;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.ObjectUtils;

import javax.annotation.Nullable;
import javax.enterprise.inject.Default;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "USERS", schema = "imagehoster")
@Getter
@Setter
public class UserEntity implements Serializable {

    @Id
    @Column(name ="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name="ROLE")
    @Size(max=36)
    private String role;

    @Column(name="EMAIL", unique = true)
    @Size(max=200)    
    @NotNull
    private String email;

    @Column(name="PASSWORD")
    @Size(max=200)
    @NotNull
    private String password;

    @Column(name="SALT")
    @Size(max=200)
    private String salt;

    @Column(name="FIRST_NAME")
    @Size(max=50)
    @NotNull
    private String firstName;

    @Column(name="LAST_NAME")
    @Size(max=50)
    private String lastName;

    @Column(name="MOBILE_PHONE")
    @Size(max=50)
    private String mobilePhone;
    
    @Column(name="LAST_LOGIN_AT")
    private Timestamp lastLoginAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserEntity)) return false;
        UserEntity that = (UserEntity) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", lastLoginAt=" + lastLoginAt +
                '}';
    }
}
