package com.test.model;

import java.util.Date;


public class TDomain{
	private static final long serialVersionUID = 8197605150148081726L;

	private Long oid;
	private String domainName;
	private String domainDesc;
	private String domainUrl;
	private String techDepart;
	private String techPerson;
	private String proPerson;
	private String proDepart;
	private String testIp;
	private String testWebpath;
	private String isDel;
	private Date outime;
	private Date oitime;
	private String domainIndex;
	private String domainNo;
	public Long getOid() {
		return oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}
	public String getDomainName() {
		return domainName;
	}
	public void setDomainName(String domainName) {
		this.domainName = (domainName == null ? null : domainName.trim());
	}
	public String getDomainDesc() {
		return domainDesc;
	}
	public void setDomainDesc(String domainDesc) {
		this.domainDesc = (domainDesc == null ? null : domainDesc.trim());
	}
	public String getDomainUrl() {
		return domainUrl;
	}
	public void setDomainUrl(String domainUrl) {
		this.domainUrl = (domainUrl == null ? null : domainUrl.trim());
	}
	public String getTechDepart() {
		return techDepart;
	}
	public void setTechDepart(String techDepart) {
		this.techDepart = (techDepart == null ? null : techDepart.trim());
	}
	public String getTechPerson() {
		return techPerson;
	}
	public void setTechPerson(String techPerson) {
		this.techPerson = (techPerson == null ? null : techPerson.trim());
	}
	public String getProPerson() {
		return proPerson;
	}
	public void setProPerson(String proPerson) {
		this.proPerson = (proPerson == null ? null : proPerson.trim());
	}
	public String getProDepart() {
		return proDepart;
	}
	public void setProDepart(String proDepart) {
		this.proDepart = (proDepart == null ? null : proDepart.trim());
	}
	public String getTestIp() {
		return testIp;
	}
	public void setTestIp(String testIp) {
		this.testIp = (testIp == null ? null : testIp.trim());
	}
	public String getTestWebpath() {
		return testWebpath;
	}
	public void setTestWebpath(String testWebpath) {
		this.testWebpath = (testWebpath == null ? null : testWebpath.trim());
	}
	public String getIsDel() {
		return isDel;
	}
	public void setIsDel(String isDel) {
		this.isDel = (isDel == null ? null : isDel.trim());
	}
	public Date getOutime() {
		return outime;
	}
	public void setOutime(Date outime) {
		this.outime = outime;
	}
	public Date getOitime() {
		return oitime;
	}
	public void setOitime(Date oitime) {
		this.oitime = oitime;
	}

	public String getDomainIndex() {
		return domainIndex;
	}

	public void setDomainIndex(String domainIndex) {
		this.domainIndex = domainIndex;
	}

	public String getDomainNo() {
		return domainNo;
	}

	public void setDomainNo(String domainNo) {
		this.domainNo = domainNo;
	}

	@Override
	public String toString() {
		return "TDomain{" +
				"oid=" + oid +
				", domainName='" + domainName + '\'' +
				", domainDesc='" + domainDesc + '\'' +
				", domainUrl='" + domainUrl + '\'' +
				", techDepart='" + techDepart + '\'' +
				", techPerson='" + techPerson + '\'' +
				", proPerson='" + proPerson + '\'' +
				", proDepart='" + proDepart + '\'' +
				", testIp='" + testIp + '\'' +
				", testWebpath='" + testWebpath + '\'' +
				", isDel='" + isDel + '\'' +
				", outime=" + outime +
				", oitime=" + oitime +
				", domainIndex='" + domainIndex + '\'' +
				", domainNo='" + domainNo + '\'' +
				'}';
	}
}
