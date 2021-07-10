package com.houston.userauth.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="EMPLOYEE")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMPLOYEE_ID")
    private Long employeeId;

    @Column(name = "INSTITUTE_ID")
    private Long instituteId;

    @Column(name = "SALARY_DETAILS")
    private Long salaryDetails;

    @Column(name = "DATE_OF_JOINING")
    @Temporal(TemporalType.DATE)
    private Date dateOfJoining;

    @Column(name="POSITION")
    private String position;

    @Column(name="JOB_LEVEL")
    private String jobLevel;

    @Column(name = "MANAGED_BY")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="employeeId")
    private EmployeeEntity managedBy;

    @Column(name = "OFFICE_ID")
    private Long officeId;

    @Column(name = "USER_CONTACT")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contactId", unique = true)
    private ContactEntity contact;
}
