// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package azureextensionmodule.proxies;

public class SharePointData
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject sharePointDataMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AzureExtensionModule.SharePointData";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		MF_ID("MF_ID"),
		SubPMP("SubPMP"),
		NPI_Type("NPI_Type"),
		MFInvest_kEUR("MFInvest_kEUR"),
		MFHour_kEUR("MFHour_kEUR"),
		WorkItem_ID("WorkItem_ID"),
		OrganisationId("OrganisationId"),
		ReleaseId("ReleaseId"),
		BaseUrl("BaseUrl"),
		ProjectName("ProjectName");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public SharePointData(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected SharePointData(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject sharePointDataMendixObject)
	{
		if (sharePointDataMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, sharePointDataMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.sharePointDataMendixObject = sharePointDataMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SharePointData.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static azureextensionmodule.proxies.SharePointData initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return azureextensionmodule.proxies.SharePointData.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static azureextensionmodule.proxies.SharePointData initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new azureextensionmodule.proxies.SharePointData(context, mendixObject);
	}

	public static azureextensionmodule.proxies.SharePointData load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return azureextensionmodule.proxies.SharePointData.initialize(context, mendixObject);
	}

	public static java.util.List<azureextensionmodule.proxies.SharePointData> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> azureextensionmodule.proxies.SharePointData.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of MF_ID
	 */
	public final java.lang.String getMF_ID()
	{
		return getMF_ID(getContext());
	}

	/**
	 * @param context
	 * @return value of MF_ID
	 */
	public final java.lang.String getMF_ID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MF_ID.toString());
	}

	/**
	 * Set value of MF_ID
	 * @param mf_id
	 */
	public final void setMF_ID(java.lang.String mf_id)
	{
		setMF_ID(getContext(), mf_id);
	}

	/**
	 * Set value of MF_ID
	 * @param context
	 * @param mf_id
	 */
	public final void setMF_ID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String mf_id)
	{
		getMendixObject().setValue(context, MemberNames.MF_ID.toString(), mf_id);
	}

	/**
	 * @return value of SubPMP
	 */
	public final java.lang.String getSubPMP()
	{
		return getSubPMP(getContext());
	}

	/**
	 * @param context
	 * @return value of SubPMP
	 */
	public final java.lang.String getSubPMP(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SubPMP.toString());
	}

	/**
	 * Set value of SubPMP
	 * @param subpmp
	 */
	public final void setSubPMP(java.lang.String subpmp)
	{
		setSubPMP(getContext(), subpmp);
	}

	/**
	 * Set value of SubPMP
	 * @param context
	 * @param subpmp
	 */
	public final void setSubPMP(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String subpmp)
	{
		getMendixObject().setValue(context, MemberNames.SubPMP.toString(), subpmp);
	}

	/**
	 * @return value of NPI_Type
	 */
	public final java.lang.String getNPI_Type()
	{
		return getNPI_Type(getContext());
	}

	/**
	 * @param context
	 * @return value of NPI_Type
	 */
	public final java.lang.String getNPI_Type(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.NPI_Type.toString());
	}

	/**
	 * Set value of NPI_Type
	 * @param npi_type
	 */
	public final void setNPI_Type(java.lang.String npi_type)
	{
		setNPI_Type(getContext(), npi_type);
	}

	/**
	 * Set value of NPI_Type
	 * @param context
	 * @param npi_type
	 */
	public final void setNPI_Type(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String npi_type)
	{
		getMendixObject().setValue(context, MemberNames.NPI_Type.toString(), npi_type);
	}

	/**
	 * @return value of MFInvest_kEUR
	 */
	public final java.lang.String getMFInvest_kEUR()
	{
		return getMFInvest_kEUR(getContext());
	}

	/**
	 * @param context
	 * @return value of MFInvest_kEUR
	 */
	public final java.lang.String getMFInvest_kEUR(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MFInvest_kEUR.toString());
	}

	/**
	 * Set value of MFInvest_kEUR
	 * @param mfinvest_keur
	 */
	public final void setMFInvest_kEUR(java.lang.String mfinvest_keur)
	{
		setMFInvest_kEUR(getContext(), mfinvest_keur);
	}

	/**
	 * Set value of MFInvest_kEUR
	 * @param context
	 * @param mfinvest_keur
	 */
	public final void setMFInvest_kEUR(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String mfinvest_keur)
	{
		getMendixObject().setValue(context, MemberNames.MFInvest_kEUR.toString(), mfinvest_keur);
	}

	/**
	 * @return value of MFHour_kEUR
	 */
	public final java.lang.String getMFHour_kEUR()
	{
		return getMFHour_kEUR(getContext());
	}

	/**
	 * @param context
	 * @return value of MFHour_kEUR
	 */
	public final java.lang.String getMFHour_kEUR(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MFHour_kEUR.toString());
	}

	/**
	 * Set value of MFHour_kEUR
	 * @param mfhour_keur
	 */
	public final void setMFHour_kEUR(java.lang.String mfhour_keur)
	{
		setMFHour_kEUR(getContext(), mfhour_keur);
	}

	/**
	 * Set value of MFHour_kEUR
	 * @param context
	 * @param mfhour_keur
	 */
	public final void setMFHour_kEUR(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String mfhour_keur)
	{
		getMendixObject().setValue(context, MemberNames.MFHour_kEUR.toString(), mfhour_keur);
	}

	/**
	 * @return value of WorkItem_ID
	 */
	public final java.lang.String getWorkItem_ID()
	{
		return getWorkItem_ID(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkItem_ID
	 */
	public final java.lang.String getWorkItem_ID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.WorkItem_ID.toString());
	}

	/**
	 * Set value of WorkItem_ID
	 * @param workitem_id
	 */
	public final void setWorkItem_ID(java.lang.String workitem_id)
	{
		setWorkItem_ID(getContext(), workitem_id);
	}

	/**
	 * Set value of WorkItem_ID
	 * @param context
	 * @param workitem_id
	 */
	public final void setWorkItem_ID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String workitem_id)
	{
		getMendixObject().setValue(context, MemberNames.WorkItem_ID.toString(), workitem_id);
	}

	/**
	 * @return value of OrganisationId
	 */
	public final java.lang.String getOrganisationId()
	{
		return getOrganisationId(getContext());
	}

	/**
	 * @param context
	 * @return value of OrganisationId
	 */
	public final java.lang.String getOrganisationId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.OrganisationId.toString());
	}

	/**
	 * Set value of OrganisationId
	 * @param organisationid
	 */
	public final void setOrganisationId(java.lang.String organisationid)
	{
		setOrganisationId(getContext(), organisationid);
	}

	/**
	 * Set value of OrganisationId
	 * @param context
	 * @param organisationid
	 */
	public final void setOrganisationId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String organisationid)
	{
		getMendixObject().setValue(context, MemberNames.OrganisationId.toString(), organisationid);
	}

	/**
	 * @return value of ReleaseId
	 */
	public final java.lang.String getReleaseId()
	{
		return getReleaseId(getContext());
	}

	/**
	 * @param context
	 * @return value of ReleaseId
	 */
	public final java.lang.String getReleaseId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ReleaseId.toString());
	}

	/**
	 * Set value of ReleaseId
	 * @param releaseid
	 */
	public final void setReleaseId(java.lang.String releaseid)
	{
		setReleaseId(getContext(), releaseid);
	}

	/**
	 * Set value of ReleaseId
	 * @param context
	 * @param releaseid
	 */
	public final void setReleaseId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String releaseid)
	{
		getMendixObject().setValue(context, MemberNames.ReleaseId.toString(), releaseid);
	}

	/**
	 * @return value of BaseUrl
	 */
	public final java.lang.String getBaseUrl()
	{
		return getBaseUrl(getContext());
	}

	/**
	 * @param context
	 * @return value of BaseUrl
	 */
	public final java.lang.String getBaseUrl(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.BaseUrl.toString());
	}

	/**
	 * Set value of BaseUrl
	 * @param baseurl
	 */
	public final void setBaseUrl(java.lang.String baseurl)
	{
		setBaseUrl(getContext(), baseurl);
	}

	/**
	 * Set value of BaseUrl
	 * @param context
	 * @param baseurl
	 */
	public final void setBaseUrl(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String baseurl)
	{
		getMendixObject().setValue(context, MemberNames.BaseUrl.toString(), baseurl);
	}

	/**
	 * @return value of ProjectName
	 */
	public final java.lang.String getProjectName()
	{
		return getProjectName(getContext());
	}

	/**
	 * @param context
	 * @return value of ProjectName
	 */
	public final java.lang.String getProjectName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ProjectName.toString());
	}

	/**
	 * Set value of ProjectName
	 * @param projectname
	 */
	public final void setProjectName(java.lang.String projectname)
	{
		setProjectName(getContext(), projectname);
	}

	/**
	 * Set value of ProjectName
	 * @param context
	 * @param projectname
	 */
	public final void setProjectName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String projectname)
	{
		getMendixObject().setValue(context, MemberNames.ProjectName.toString(), projectname);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return sharePointDataMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final azureextensionmodule.proxies.SharePointData that = (azureextensionmodule.proxies.SharePointData) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}