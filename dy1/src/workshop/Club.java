package workshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Club {

	private int currentNumber = 1;
	// private Member[] members;
	// static final int maxMem = 10;

	private ArrayList<Member> memberList;
	private HashMap<String, Facility> facilityHM = new HashMap<String, Facility>();

	public Club() {
		// members = new Member[maxMem];
		memberList = new ArrayList<>();
	}

	public Member addMember(Person p) {
		Member m = new Member(p.surName, p.firstName, p.secondName, currentNumber);

		// members[currentNumber] = m;
		memberList.add(m);

		currentNumber++;
		return m;
	}

	public void showMembers() {

		for (Member member : memberList) {
			// if (member != null)
			// member.show();
			member.show();
		}

	}

	public void removeMember(int memberNum) {
		// if(memberNum >=1 && memberNum <=maxMem-1 ) {
		// members[memberNum] = null;
		// }
		// else {
		// System.out.println("out of memberNum");
		// }

		for (Member member : memberList) {
			if (memberNum == member.getMemberNumber()) {
				memberList.remove(member);
				return;
			}
			// break;

		}
	}

	public void addFacility(Facility f) {
		facilityHM.put(f.getName(), f);
	}

	public void removeFacility(String name) {
		facilityHM.remove(name);
	}

	public void showFacilities() {

		for (Entry<String, Facility> entry : facilityHM.entrySet()) {

			System.out.println("key: " + entry.getKey() + "\n" + "value: " + entry.getValue());
			// ...
		}
	}

}
