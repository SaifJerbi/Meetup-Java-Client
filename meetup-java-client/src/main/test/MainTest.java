package test;

import java.util.List;

import meetup.ClientSettings;
import meetup.MeetupClient;
import meetup.Member;
import meetup.MemberSearchCriteria;

public class MainTest {
	public static void main(String[] args) {
		ClientSettings settings = new ClientSettings();
		settings.setMeetupKey("1ec7f3873471e53377e594d35246a5f");

		MeetupClient c = new MeetupClient();
		c.setClientSettings(settings);

		MemberSearchCriteria criteria = new MemberSearchCriteria();
		criteria.setGroup_urlname("Vaadin-Tunis");

		List<Member> m = c.getMembers(criteria);
		for (Member mm : m)
			System.out.println("member name " + mm.getLang());
	}
}
