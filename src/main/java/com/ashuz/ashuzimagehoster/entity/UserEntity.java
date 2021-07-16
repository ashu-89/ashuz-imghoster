package com.ashuz.ashuzimagehoster.entity;

import org.apache.commons.lang3.ObjectUtils;

import javax.enterprise.inject.Default;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "USERS", schema = "imagehoster")
public class UserEntity {

    @Id
    @Column(name ="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="UUID")
    @Size(max=36)
    @NotNull
    private String uuid;

    @Column(name="ROLE")
    @Size(max=36)
    @NotNull
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
    @NotNull
    private String salt;

    @Column(name="FIRST_NAME")
    @Size(max=50)
    @NotNull
    private String firstName;

    @Column(name="LAST_NAME")
    @Size(max=50)
    @NotNull
    private String lastName;

    @Column(name="MOBILE_PHONE")
    @Size(max=50)
    @NotNull
    private String mobilePhone;
    
    @Column(name="LAST_LOGIN_AT")
    @Null
    private Timestamp lastLoginAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserEntity)) return false;
        UserEntity that = (UserEntity) o;
        return uuid.equals(that.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
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
