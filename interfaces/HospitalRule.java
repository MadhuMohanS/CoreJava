package com.xworkz.mobile.interfaces;

public interface HospitalRule {
	public final double meetingTime = 2.0;
	public final boolean appoitment = true;

	public abstract void billPayment();

	public abstract void maintainSilence();

	public abstract void dontuseMobile();

	public abstract void checkup();
}
