package com.scm.entities;

import java.util.*;

import jakarta.persistence.*;
import lombok.*;

@Entity(name ="user")
@Table(name ="users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
	
	@Id
	private String userId;
	@Column(name ="user_name",nullable = false)
	private String name;
	@Column(unique = true,nullable =false)
	private String email;
	private String password;
	@Column(length = 1000)
	private String about;
	private String profilePic;
	private String number;
	
	private boolean enabled=false;
	private boolean emailverified = false;
	private boolean phoneVerified = false;
	
	private Providers provider=Providers.SELF;
	private String providerUserid;

	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
	private List<Contact> contacts =new ArrayList<>();

	
}
