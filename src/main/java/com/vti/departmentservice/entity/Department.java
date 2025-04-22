package com.vti.departmentservice.entity;

import java.util.Date;
import java.util.List;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Department")
@Data
public class Department {
    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name", length = 150, unique = true)
    private String name;

    @Column(name="total_member")
    private int totalMember;

    @Column(name="type", unique = true, columnDefinition = "ENUM('DEV', 'TEST', 'BA', 'PM')")
    @Enumerated(EnumType.STRING)
    private DepartmentType type;

    @Column(name="created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @CreationTimestamp
    private Date createdAt;

    @OneToMany(mappedBy = "department")
    private List<Account> accounts;

    public enum DepartmentType {
        DEV, TEST, BA, PM;

        public static DepartmentType toEnum(String type) {
            for (DepartmentType item : DepartmentType.values()) {
				if (item.toString().equals(type)) return item;
			}
			return null;
        }
    }
}
