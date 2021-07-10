package com.houston.userauth.entity;

import com.houston.userauth.model.Employee;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="employeeId")
    private EmployeeEntity managedBy;

    @Column(name = "OFFICE_ID")
    private Long officeId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contactId", unique = true)
    private ContactEntity contact;

    public EmployeeEntity() {
        super();
    }

    public EmployeeEntity(
            Long instituteId,
            Long salaryDetails,
            Date dateOfJoining,
            String position,
            String jobLevel,
            EmployeeEntity managedBy,
            Long officeId,
            ContactEntity contact
    ) {
        super();
        this.instituteId = instituteId;
        this.salaryDetails = salaryDetails;
        this.dateOfJoining = dateOfJoining;
        this.position = position;
        this.jobLevel = jobLevel;
        this.managedBy = managedBy;
        this.officeId = officeId;
        this.contact = contact;
    }

    public EmployeeEntity(Employee emp){
        this.instituteId = emp.getInstituteId();
        this.salaryDetails = salaryDetails;
        this.dateOfJoining = dateOfJoining;
        this.position = position;
        this.jobLevel = jobLevel;
        this.managedBy = managedBy;
        this.officeId = officeId;
        this.contact = contact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeEntity that = (EmployeeEntity) o;
        return Objects.equals(employeeId, that.employeeId) && Objects.equals(instituteId, that.instituteId) && Objects.equals(salaryDetails, that.salaryDetails) && Objects.equals(dateOfJoining, that.dateOfJoining) && Objects.equals(position, that.position) && Objects.equals(jobLevel, that.jobLevel) && Objects.equals(managedBy, that.managedBy) && Objects.equals(officeId, that.officeId) && Objects.equals(contact, that.contact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, instituteId, salaryDetails, dateOfJoining, position, jobLevel, managedBy, officeId, contact);
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "employeeId=" + employeeId +
                ", instituteId=" + instituteId +
                ", salaryDetails=" + salaryDetails +
                ", dateOfJoining=" + dateOfJoining +
                ", position='" + position + '\'' +
                ", jobLevel='" + jobLevel + '\'' +
                ", managedBy=" + managedBy +
                ", officeId=" + officeId +
                ", contact=" + contact +
                '}';
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(Long instituteId) {
        this.instituteId = instituteId;
    }

    public Long getSalaryDetails() {
        return salaryDetails;
    }

    public void setSalaryDetails(Long salaryDetails) {
        this.salaryDetails = salaryDetails;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel;
    }

    public EmployeeEntity getManagedBy() {
        return managedBy;
    }

    public void setManagedBy(EmployeeEntity managedBy) {
        this.managedBy = managedBy;
    }

    public Long getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Long officeId) {
        this.officeId = officeId;
    }

    public ContactEntity getContact() {
        return contact;
    }

    public void setContact(ContactEntity contact) {
        this.contact = contact;
    }
}
