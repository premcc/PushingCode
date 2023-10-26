package PayLoad_Using_Many_Ways;

public class Payload_Final {
	
	String desciption;
	String summary;
	IssueType issuetype;
	
	Projects project;
	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public IssueType getIssuetype() {
		return issuetype;
	}

	public void setIssuetype(IssueType issuetype) {
		this.issuetype = issuetype;
	}

	public Projects getProject() {
		return project;
	}

	public void setProject(Projects project) {
		this.project = project;
	}

	
	
	public Payload_Final(String desciption,String summary,IssueType issue,Projects pro)
	{
		
		this.desciption=desciption;
		this.summary=summary;
		this.issuetype=issue;
		this.project=pro;
	}

}
