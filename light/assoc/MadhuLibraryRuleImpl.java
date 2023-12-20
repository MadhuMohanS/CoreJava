package com.xworkz.light.assoc;

public class MadhuLibraryRuleImpl implements LibraryRule{
@Override
public boolean keepSilence() {
	System.out.println("running keepsilence in madhulibraryruleimpl");
	return true;
}
@Override
public String memberID() {
	System.out.println("running memberid in madhulibraryruleimpl");
	return "madhu-101";
}
}
