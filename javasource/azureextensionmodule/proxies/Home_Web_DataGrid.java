// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package azureextensionmodule.proxies;

public class Home_Web_DataGrid extends system.proxies.Paging
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AzureExtensionModule.Home_Web_DataGrid";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		System_Id("System_Id"),
		System_WorkItemType("System_WorkItemType"),
		System_Title("System_Title"),
		Microsoft_VSTS_TCM_ReproSteps("Microsoft_VSTS_TCM_ReproSteps"),
		PageNumber("PageNumber"),
		IsSortable("IsSortable"),
		SortAttribute("SortAttribute"),
		SortAscending("SortAscending"),
		HasMoreData("HasMoreData");

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

	public Home_Web_DataGrid(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Home_Web_DataGrid(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject home_Web_DataGridMendixObject)
	{
		super(context, home_Web_DataGridMendixObject);
		if (!com.mendix.core.Core.isSubClassOf(entityName, home_Web_DataGridMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	
	}

	/**
	 * @deprecated Use 'Home_Web_DataGrid.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static azureextensionmodule.proxies.Home_Web_DataGrid initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return azureextensionmodule.proxies.Home_Web_DataGrid.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static azureextensionmodule.proxies.Home_Web_DataGrid initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new azureextensionmodule.proxies.Home_Web_DataGrid(context, mendixObject);
	}

	public static azureextensionmodule.proxies.Home_Web_DataGrid load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return azureextensionmodule.proxies.Home_Web_DataGrid.initialize(context, mendixObject);
	}

	/**
	 * @return value of System_Id
	 */
	public final java.lang.Integer getSystem_Id()
	{
		return getSystem_Id(getContext());
	}

	/**
	 * @param context
	 * @return value of System_Id
	 */
	public final java.lang.Integer getSystem_Id(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.System_Id.toString());
	}

	/**
	 * Set value of System_Id
	 * @param system_id
	 */
	public final void setSystem_Id(java.lang.Integer system_id)
	{
		setSystem_Id(getContext(), system_id);
	}

	/**
	 * Set value of System_Id
	 * @param context
	 * @param system_id
	 */
	public final void setSystem_Id(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer system_id)
	{
		getMendixObject().setValue(context, MemberNames.System_Id.toString(), system_id);
	}

	/**
	 * @return value of System_WorkItemType
	 */
	public final java.lang.String getSystem_WorkItemType()
	{
		return getSystem_WorkItemType(getContext());
	}

	/**
	 * @param context
	 * @return value of System_WorkItemType
	 */
	public final java.lang.String getSystem_WorkItemType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.System_WorkItemType.toString());
	}

	/**
	 * Set value of System_WorkItemType
	 * @param system_workitemtype
	 */
	public final void setSystem_WorkItemType(java.lang.String system_workitemtype)
	{
		setSystem_WorkItemType(getContext(), system_workitemtype);
	}

	/**
	 * Set value of System_WorkItemType
	 * @param context
	 * @param system_workitemtype
	 */
	public final void setSystem_WorkItemType(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String system_workitemtype)
	{
		getMendixObject().setValue(context, MemberNames.System_WorkItemType.toString(), system_workitemtype);
	}

	/**
	 * @return value of System_Title
	 */
	public final java.lang.String getSystem_Title()
	{
		return getSystem_Title(getContext());
	}

	/**
	 * @param context
	 * @return value of System_Title
	 */
	public final java.lang.String getSystem_Title(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.System_Title.toString());
	}

	/**
	 * Set value of System_Title
	 * @param system_title
	 */
	public final void setSystem_Title(java.lang.String system_title)
	{
		setSystem_Title(getContext(), system_title);
	}

	/**
	 * Set value of System_Title
	 * @param context
	 * @param system_title
	 */
	public final void setSystem_Title(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String system_title)
	{
		getMendixObject().setValue(context, MemberNames.System_Title.toString(), system_title);
	}

	/**
	 * @return value of Microsoft_VSTS_TCM_ReproSteps
	 */
	public final java.lang.String getMicrosoft_VSTS_TCM_ReproSteps()
	{
		return getMicrosoft_VSTS_TCM_ReproSteps(getContext());
	}

	/**
	 * @param context
	 * @return value of Microsoft_VSTS_TCM_ReproSteps
	 */
	public final java.lang.String getMicrosoft_VSTS_TCM_ReproSteps(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Microsoft_VSTS_TCM_ReproSteps.toString());
	}

	/**
	 * Set value of Microsoft_VSTS_TCM_ReproSteps
	 * @param microsoft_vsts_tcm_reprosteps
	 */
	public final void setMicrosoft_VSTS_TCM_ReproSteps(java.lang.String microsoft_vsts_tcm_reprosteps)
	{
		setMicrosoft_VSTS_TCM_ReproSteps(getContext(), microsoft_vsts_tcm_reprosteps);
	}

	/**
	 * Set value of Microsoft_VSTS_TCM_ReproSteps
	 * @param context
	 * @param microsoft_vsts_tcm_reprosteps
	 */
	public final void setMicrosoft_VSTS_TCM_ReproSteps(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String microsoft_vsts_tcm_reprosteps)
	{
		getMendixObject().setValue(context, MemberNames.Microsoft_VSTS_TCM_ReproSteps.toString(), microsoft_vsts_tcm_reprosteps);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final azureextensionmodule.proxies.Home_Web_DataGrid that = (azureextensionmodule.proxies.Home_Web_DataGrid) obj;
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
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
