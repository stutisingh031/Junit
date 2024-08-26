package com.project.leave;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class DataTest {
	@Test
	public void testLeaveDetails() {
		LeaveDetails leaveDetails = new LeaveDetails();
		LeaveDetails leave = new LeaveDetails(1, 101, LeaveType.ML, LeaveStatus.ACCEPTED, new Date(2024, 8, 1), new Date(2024, 10, 5), "Medical Leave");
  
        assertEquals(1, leave.getLeaveId());
        assertEquals(101, leave.getEmpId());
        assertEquals(LeaveType.ML, leave.getLeaveType());
        assertEquals(LeaveStatus.ACCEPTED, leave.getLeaveStatus());
        assertEquals(new Date(2024, 8, 1), leave.getLeaveStartDate());
		
	}
	@Test
	public void testSettersAndGetters() {
	    LeaveDetails leaveDetails = new LeaveDetails();
	    leaveDetails.setLeaveId(2);
	    leaveDetails.setEmpId(102);
	    leaveDetails.setLeaveType(LeaveType.PL);
	    leaveDetails.setLeaveStatus(LeaveStatus.PENDING);
	    leaveDetails.setLeaveStartDate(new Date(2024, 9, 9));
	    leaveDetails.setLeaveEndDate(new Date(2024, 10, 10));
	    leaveDetails.setLeaveReason("Personal work");

	    assertEquals(2, leaveDetails.getLeaveId());
	    assertEquals(102, leaveDetails.getEmpId());
	    assertEquals(LeaveType.PL, leaveDetails.getLeaveType());
	    assertEquals(LeaveStatus.PENDING, leaveDetails.getLeaveStatus());
	    assertEquals(new Date(2024, 9, 9), leaveDetails.getLeaveStartDate());
	    assertEquals(new Date(2024, 10, 10), leaveDetails.getLeaveEndDate());
	    assertEquals("Personal work", leaveDetails.getLeaveReason());
	
}
	@Test
	public void testToString() {
	    LeaveDetails leaveDetails = new LeaveDetails(3, 103, LeaveType.EL, LeaveStatus.REJECTED, new Date(2024, 9, 1), new Date(2024, 9, 2), "vacation");
	    String expectedString = "LeaveDetails [leaveId=3, empId=103, leaveType=EL, leaveStatus=REJECTED, leaveStartDate=" + leaveDetails.getLeaveStartDate() + ", leaveEndDate=" + leaveDetails.getLeaveEndDate() + ", leaveReason=vacation]";
	    assertEquals(expectedString, leaveDetails.toString());
	}
	
	
}
