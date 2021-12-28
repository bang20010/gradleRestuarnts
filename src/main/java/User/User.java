package User;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.lang.NonNull;

import lombok.Data;


@Data
@Entity
public class User 
	{
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@SequenceGenerator(name = "USER_SEQ_GENERATOR", sequenceName ="TEAM_SEQ", initialValue = 1, allocationSize = 1 )
		@Column(name = "signupNum", columnDefinition = "number(30)")
		private long signupNum;
		
		@NonNull
		@Column(name = "ID", columnDefinition = "varchar(14)")
		private String id;
		
		@NonNull
		@Column(name = "PW" , columnDefinition = "varchar(20)")
		private String pw;
		
		@NonNull
		@Column(name = "ADDRESS",columnDefinition = "varchar(200)")
		private String address;
		
		@NonNull
		@Column(name = "EMAIL" ,columnDefinition = "varchar(100)")
		private String email;
		
		@NonNull
		@Column(name = "PHONE",columnDefinition = "varchar(13)")
		private String phone;
		
		@CreationTimestamp
		private Timestamp signupDate;

	

		public User() {
			// TODO Auto-generated constructor stub
		}
		
		public User(long signupNum, String id, String pw, String address, String email, String phone,
				Timestamp signupDate) {
			super();
			this.signupNum = signupNum;
			this.id = id;
			this.pw = pw;
			this.address = address;
			this.email = email;
			this.phone = phone;
			this.signupDate = signupDate;
		}

		
		
	}
