package com.houston.userauth.model;

import com.houston.userauth.entity.ContactEntity;
import com.houston.userauth.entity.EmployeeEntity;

import java.util.Date;
import java.util.Objects;

public class Employee {
    private Long employeeId;
    private Long instituteId;
    private Long salaryDetails;
    private Date dateOfJoining;
    private String position;
    private String jobLevel;
    private Employee managedBy;
    private Long officeId;
    private Contact contact;

    public Employee() {
        super();
    }

    public Employee(
            Long instituteId,
            Long salaryDetails,
            Date dateOfJoining,
            String position,
            String jobLevel,
            Employee managedBy,
            Long officeId,
            Contact contact
    ) {
        this.instituteId = instituteId;
        this.salaryDetails = salaryDetails;
        this.dateOfJoining = dateOfJoining;
        this.position = position;
        this.jobLevel = jobLevel;
        this.managedBy = managedBy;
        this.officeId = officeId;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Employee{" +
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeId, employee.employeeId) && Objects.equals(instituteId, employee.instituteId) && Objects.equals(salaryDetails, employee.salaryDetails) && Objects.equals(dateOfJoining, employee.dateOfJoining) && Objects.equals(position, employee.position) && Objects.equals(jobLevel, employee.jobLevel) && Objects.equals(managedBy, employee.managedBy) && Objects.equals(officeId, employee.officeId) && Objects.equals(contact, employee.contact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, instituteId, salaryDetails, dateOfJoining, position, jobLevel, managedBy, officeId, contact);
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

    public Employee getManagedBy() {
        return managedBy;
    }

    public void setManagedBy(Employee managedBy) {
        this.managedBy = managedBy;
    }

    public Long getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Long officeId) {
        this.officeId = officeId;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
