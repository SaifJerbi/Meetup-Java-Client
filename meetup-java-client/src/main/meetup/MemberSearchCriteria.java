package meetup;

import java.util.HashMap;
import java.util.Map;

public class MemberSearchCriteria {
	private String member_id;
	private String group_id;
	private String group_urlname;

	private Map<String, String> parameters;

	public MemberSearchCriteria() {
	}

	public MemberSearchCriteria(SearchCriteria<Member> searchCriteria) {
		parameters = searchCriteria.getParameters();
	}

	public Map<String, String> getParameterMap() {
		if (parameters != null && !parameters.isEmpty()) {
			return parameters;
		}

		Map<String, String> m = new HashMap<String, String>();
		if (getMember_id() != null)
			m.put("member_id", getMember_id());
		if (getGroup_id() != null)
			m.put("group_id", getGroup_id());
		if (getGroup_urlname() != null)
			m.put("group_urlname", getGroup_urlname());

		return m;

	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getGroup_id() {
		return group_id;
	}

	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}

	public String getGroup_urlname() {
		return group_urlname;
	}

	public void setGroup_urlname(String group_urlname) {
		this.group_urlname = group_urlname;
	}

}
