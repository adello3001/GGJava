package section03.member;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		String str = String.format("Member:id(%s)", this.id);
		return str;
	}
}
