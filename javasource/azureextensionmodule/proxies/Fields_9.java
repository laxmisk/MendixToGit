// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package azureextensionmodule.proxies;

public class Fields_9
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject fields_9MendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AzureExtensionModule.Fields_9";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		System_AreaPath("System_AreaPath"),
		System_TeamProject("System_TeamProject"),
		System_IterationPath("System_IterationPath"),
		System_WorkItemType("System_WorkItemType"),
		System_State("System_State"),
		System_Reason("System_Reason"),
		System_CreatedDate("System_CreatedDate"),
		System_CreatedBy("System_CreatedBy"),
		System_ChangedDate("System_ChangedDate"),
		System_ChangedBy("System_ChangedBy"),
		System_CommentCount("System_CommentCount"),
		System_Title("System_Title"),
		Microsoft_VSTS_Common_StateChangeDate("Microsoft_VSTS_Common_StateChangeDate"),
		Custom_Type("Custom_Type"),
		Custom_PM200("Custom_PM200"),
		Custom_PM300Plan("Custom_PM300Plan"),
		Custom_PM300ActualorForecast("Custom_PM300ActualorForecast"),
		Custom_PM300Deviation("Custom_PM300Deviation"),
		Custom_MFinvolved("Custom_MFinvolved"),
		System_Description("System_Description"),
		System_Parent("System_Parent"),
		System_AssignedTo("System_AssignedTo"),
		Fields_9_Resource_7("AzureExtensionModule.Fields_9_Resource_7");

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

	public Fields_9(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Fields_9(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject fields_9MendixObject)
	{
		if (fields_9MendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, fields_9MendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.fields_9MendixObject = fields_9MendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Fields_9.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static azureextensionmodule.proxies.Fields_9 initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return azureextensionmodule.proxies.Fields_9.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static azureextensionmodule.proxies.Fields_9 initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new azureextensionmodule.proxies.Fields_9(context, mendixObject);
	}

	public static azureextensionmodule.proxies.Fields_9 load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return azureextensionmodule.proxies.Fields_9.initialize(context, mendixObject);
	}

	public static java.util.List<azureextensionmodule.proxies.Fields_9> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> azureextensionmodule.proxies.Fields_9.initialize(context, obj))
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
	 * @return value of System_AreaPath
	 */
	public final java.lang.String getSystem_AreaPath()
	{
		return getSystem_AreaPath(getContext());
	}

	/**
	 * @param context
	 * @return value of System_AreaPath
	 */
	public final java.lang.String getSystem_AreaPath(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.System_AreaPath.toString());
	}

	/**
	 * Set value of System_AreaPath
	 * @param system_areapath
	 */
	public final void setSystem_AreaPath(java.lang.String system_areapath)
	{
		setSystem_AreaPath(getContext(), system_areapath);
	}

	/**
	 * Set value of System_AreaPath
	 * @param context
	 * @param system_areapath
	 */
	public final void setSystem_AreaPath(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String system_areapath)
	{
		getMendixObject().setValue(context, MemberNames.System_AreaPath.toString(), system_areapath);
	}

	/**
	 * @return value of System_TeamProject
	 */
	public final java.lang.String getSystem_TeamProject()
	{
		return getSystem_TeamProject(getContext());
	}

	/**
	 * @param context
	 * @return value of System_TeamProject
	 */
	public final java.lang.String getSystem_TeamProject(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.System_TeamProject.toString());
	}

	/**
	 * Set value of System_TeamProject
	 * @param system_teamproject
	 */
	public final void setSystem_TeamProject(java.lang.String system_teamproject)
	{
		setSystem_TeamProject(getContext(), system_teamproject);
	}

	/**
	 * Set value of System_TeamProject
	 * @param context
	 * @param system_teamproject
	 */
	public final void setSystem_TeamProject(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String system_teamproject)
	{
		getMendixObject().setValue(context, MemberNames.System_TeamProject.toString(), system_teamproject);
	}

	/**
	 * @return value of System_IterationPath
	 */
	public final java.lang.String getSystem_IterationPath()
	{
		return getSystem_IterationPath(getContext());
	}

	/**
	 * @param context
	 * @return value of System_IterationPath
	 */
	public final java.lang.String getSystem_IterationPath(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.System_IterationPath.toString());
	}

	/**
	 * Set value of System_IterationPath
	 * @param system_iterationpath
	 */
	public final void setSystem_IterationPath(java.lang.String system_iterationpath)
	{
		setSystem_IterationPath(getContext(), system_iterationpath);
	}

	/**
	 * Set value of System_IterationPath
	 * @param context
	 * @param system_iterationpath
	 */
	public final void setSystem_IterationPath(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String system_iterationpath)
	{
		getMendixObject().setValue(context, MemberNames.System_IterationPath.toString(), system_iterationpath);
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
	 * @return value of System_State
	 */
	public final java.lang.String getSystem_State()
	{
		return getSystem_State(getContext());
	}

	/**
	 * @param context
	 * @return value of System_State
	 */
	public final java.lang.String getSystem_State(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.System_State.toString());
	}

	/**
	 * Set value of System_State
	 * @param system_state
	 */
	public final void setSystem_State(java.lang.String system_state)
	{
		setSystem_State(getContext(), system_state);
	}

	/**
	 * Set value of System_State
	 * @param context
	 * @param system_state
	 */
	public final void setSystem_State(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String system_state)
	{
		getMendixObject().setValue(context, MemberNames.System_State.toString(), system_state);
	}

	/**
	 * @return value of System_Reason
	 */
	public final java.lang.String getSystem_Reason()
	{
		return getSystem_Reason(getContext());
	}

	/**
	 * @param context
	 * @return value of System_Reason
	 */
	public final java.lang.String getSystem_Reason(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.System_Reason.toString());
	}

	/**
	 * Set value of System_Reason
	 * @param system_reason
	 */
	public final void setSystem_Reason(java.lang.String system_reason)
	{
		setSystem_Reason(getContext(), system_reason);
	}

	/**
	 * Set value of System_Reason
	 * @param context
	 * @param system_reason
	 */
	public final void setSystem_Reason(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String system_reason)
	{
		getMendixObject().setValue(context, MemberNames.System_Reason.toString(), system_reason);
	}

	/**
	 * @return value of System_CreatedDate
	 */
	public final java.util.Date getSystem_CreatedDate()
	{
		return getSystem_CreatedDate(getContext());
	}

	/**
	 * @param context
	 * @return value of System_CreatedDate
	 */
	public final java.util.Date getSystem_CreatedDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.System_CreatedDate.toString());
	}

	/**
	 * Set value of System_CreatedDate
	 * @param system_createddate
	 */
	public final void setSystem_CreatedDate(java.util.Date system_createddate)
	{
		setSystem_CreatedDate(getContext(), system_createddate);
	}

	/**
	 * Set value of System_CreatedDate
	 * @param context
	 * @param system_createddate
	 */
	public final void setSystem_CreatedDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date system_createddate)
	{
		getMendixObject().setValue(context, MemberNames.System_CreatedDate.toString(), system_createddate);
	}

	/**
	 * @return value of System_CreatedBy
	 */
	public final java.lang.String getSystem_CreatedBy()
	{
		return getSystem_CreatedBy(getContext());
	}

	/**
	 * @param context
	 * @return value of System_CreatedBy
	 */
	public final java.lang.String getSystem_CreatedBy(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.System_CreatedBy.toString());
	}

	/**
	 * Set value of System_CreatedBy
	 * @param system_createdby
	 */
	public final void setSystem_CreatedBy(java.lang.String system_createdby)
	{
		setSystem_CreatedBy(getContext(), system_createdby);
	}

	/**
	 * Set value of System_CreatedBy
	 * @param context
	 * @param system_createdby
	 */
	public final void setSystem_CreatedBy(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String system_createdby)
	{
		getMendixObject().setValue(context, MemberNames.System_CreatedBy.toString(), system_createdby);
	}

	/**
	 * @return value of System_ChangedDate
	 */
	public final java.util.Date getSystem_ChangedDate()
	{
		return getSystem_ChangedDate(getContext());
	}

	/**
	 * @param context
	 * @return value of System_ChangedDate
	 */
	public final java.util.Date getSystem_ChangedDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.System_ChangedDate.toString());
	}

	/**
	 * Set value of System_ChangedDate
	 * @param system_changeddate
	 */
	public final void setSystem_ChangedDate(java.util.Date system_changeddate)
	{
		setSystem_ChangedDate(getContext(), system_changeddate);
	}

	/**
	 * Set value of System_ChangedDate
	 * @param context
	 * @param system_changeddate
	 */
	public final void setSystem_ChangedDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date system_changeddate)
	{
		getMendixObject().setValue(context, MemberNames.System_ChangedDate.toString(), system_changeddate);
	}

	/**
	 * @return value of System_ChangedBy
	 */
	public final java.lang.String getSystem_ChangedBy()
	{
		return getSystem_ChangedBy(getContext());
	}

	/**
	 * @param context
	 * @return value of System_ChangedBy
	 */
	public final java.lang.String getSystem_ChangedBy(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.System_ChangedBy.toString());
	}

	/**
	 * Set value of System_ChangedBy
	 * @param system_changedby
	 */
	public final void setSystem_ChangedBy(java.lang.String system_changedby)
	{
		setSystem_ChangedBy(getContext(), system_changedby);
	}

	/**
	 * Set value of System_ChangedBy
	 * @param context
	 * @param system_changedby
	 */
	public final void setSystem_ChangedBy(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String system_changedby)
	{
		getMendixObject().setValue(context, MemberNames.System_ChangedBy.toString(), system_changedby);
	}

	/**
	 * @return value of System_CommentCount
	 */
	public final java.lang.Integer getSystem_CommentCount()
	{
		return getSystem_CommentCount(getContext());
	}

	/**
	 * @param context
	 * @return value of System_CommentCount
	 */
	public final java.lang.Integer getSystem_CommentCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.System_CommentCount.toString());
	}

	/**
	 * Set value of System_CommentCount
	 * @param system_commentcount
	 */
	public final void setSystem_CommentCount(java.lang.Integer system_commentcount)
	{
		setSystem_CommentCount(getContext(), system_commentcount);
	}

	/**
	 * Set value of System_CommentCount
	 * @param context
	 * @param system_commentcount
	 */
	public final void setSystem_CommentCount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer system_commentcount)
	{
		getMendixObject().setValue(context, MemberNames.System_CommentCount.toString(), system_commentcount);
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
	 * @return value of Microsoft_VSTS_Common_StateChangeDate
	 */
	public final java.util.Date getMicrosoft_VSTS_Common_StateChangeDate()
	{
		return getMicrosoft_VSTS_Common_StateChangeDate(getContext());
	}

	/**
	 * @param context
	 * @return value of Microsoft_VSTS_Common_StateChangeDate
	 */
	public final java.util.Date getMicrosoft_VSTS_Common_StateChangeDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Microsoft_VSTS_Common_StateChangeDate.toString());
	}

	/**
	 * Set value of Microsoft_VSTS_Common_StateChangeDate
	 * @param microsoft_vsts_common_statechangedate
	 */
	public final void setMicrosoft_VSTS_Common_StateChangeDate(java.util.Date microsoft_vsts_common_statechangedate)
	{
		setMicrosoft_VSTS_Common_StateChangeDate(getContext(), microsoft_vsts_common_statechangedate);
	}

	/**
	 * Set value of Microsoft_VSTS_Common_StateChangeDate
	 * @param context
	 * @param microsoft_vsts_common_statechangedate
	 */
	public final void setMicrosoft_VSTS_Common_StateChangeDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date microsoft_vsts_common_statechangedate)
	{
		getMendixObject().setValue(context, MemberNames.Microsoft_VSTS_Common_StateChangeDate.toString(), microsoft_vsts_common_statechangedate);
	}

	/**
	 * @return value of Custom_Type
	 */
	public final java.lang.String getCustom_Type()
	{
		return getCustom_Type(getContext());
	}

	/**
	 * @param context
	 * @return value of Custom_Type
	 */
	public final java.lang.String getCustom_Type(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Custom_Type.toString());
	}

	/**
	 * Set value of Custom_Type
	 * @param custom_type
	 */
	public final void setCustom_Type(java.lang.String custom_type)
	{
		setCustom_Type(getContext(), custom_type);
	}

	/**
	 * Set value of Custom_Type
	 * @param context
	 * @param custom_type
	 */
	public final void setCustom_Type(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String custom_type)
	{
		getMendixObject().setValue(context, MemberNames.Custom_Type.toString(), custom_type);
	}

	/**
	 * @return value of Custom_PM200
	 */
	public final java.util.Date getCustom_PM200()
	{
		return getCustom_PM200(getContext());
	}

	/**
	 * @param context
	 * @return value of Custom_PM200
	 */
	public final java.util.Date getCustom_PM200(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Custom_PM200.toString());
	}

	/**
	 * Set value of Custom_PM200
	 * @param custom_pm200
	 */
	public final void setCustom_PM200(java.util.Date custom_pm200)
	{
		setCustom_PM200(getContext(), custom_pm200);
	}

	/**
	 * Set value of Custom_PM200
	 * @param context
	 * @param custom_pm200
	 */
	public final void setCustom_PM200(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date custom_pm200)
	{
		getMendixObject().setValue(context, MemberNames.Custom_PM200.toString(), custom_pm200);
	}

	/**
	 * @return value of Custom_PM300Plan
	 */
	public final java.util.Date getCustom_PM300Plan()
	{
		return getCustom_PM300Plan(getContext());
	}

	/**
	 * @param context
	 * @return value of Custom_PM300Plan
	 */
	public final java.util.Date getCustom_PM300Plan(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Custom_PM300Plan.toString());
	}

	/**
	 * Set value of Custom_PM300Plan
	 * @param custom_pm300plan
	 */
	public final void setCustom_PM300Plan(java.util.Date custom_pm300plan)
	{
		setCustom_PM300Plan(getContext(), custom_pm300plan);
	}

	/**
	 * Set value of Custom_PM300Plan
	 * @param context
	 * @param custom_pm300plan
	 */
	public final void setCustom_PM300Plan(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date custom_pm300plan)
	{
		getMendixObject().setValue(context, MemberNames.Custom_PM300Plan.toString(), custom_pm300plan);
	}

	/**
	 * @return value of Custom_PM300ActualorForecast
	 */
	public final java.util.Date getCustom_PM300ActualorForecast()
	{
		return getCustom_PM300ActualorForecast(getContext());
	}

	/**
	 * @param context
	 * @return value of Custom_PM300ActualorForecast
	 */
	public final java.util.Date getCustom_PM300ActualorForecast(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Custom_PM300ActualorForecast.toString());
	}

	/**
	 * Set value of Custom_PM300ActualorForecast
	 * @param custom_pm300actualorforecast
	 */
	public final void setCustom_PM300ActualorForecast(java.util.Date custom_pm300actualorforecast)
	{
		setCustom_PM300ActualorForecast(getContext(), custom_pm300actualorforecast);
	}

	/**
	 * Set value of Custom_PM300ActualorForecast
	 * @param context
	 * @param custom_pm300actualorforecast
	 */
	public final void setCustom_PM300ActualorForecast(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date custom_pm300actualorforecast)
	{
		getMendixObject().setValue(context, MemberNames.Custom_PM300ActualorForecast.toString(), custom_pm300actualorforecast);
	}

	/**
	 * @return value of Custom_PM300Deviation
	 */
	public final java.lang.Integer getCustom_PM300Deviation()
	{
		return getCustom_PM300Deviation(getContext());
	}

	/**
	 * @param context
	 * @return value of Custom_PM300Deviation
	 */
	public final java.lang.Integer getCustom_PM300Deviation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Custom_PM300Deviation.toString());
	}

	/**
	 * Set value of Custom_PM300Deviation
	 * @param custom_pm300deviation
	 */
	public final void setCustom_PM300Deviation(java.lang.Integer custom_pm300deviation)
	{
		setCustom_PM300Deviation(getContext(), custom_pm300deviation);
	}

	/**
	 * Set value of Custom_PM300Deviation
	 * @param context
	 * @param custom_pm300deviation
	 */
	public final void setCustom_PM300Deviation(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer custom_pm300deviation)
	{
		getMendixObject().setValue(context, MemberNames.Custom_PM300Deviation.toString(), custom_pm300deviation);
	}

	/**
	 * @return value of Custom_MFinvolved
	 */
	public final java.lang.Boolean getCustom_MFinvolved()
	{
		return getCustom_MFinvolved(getContext());
	}

	/**
	 * @param context
	 * @return value of Custom_MFinvolved
	 */
	public final java.lang.Boolean getCustom_MFinvolved(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Custom_MFinvolved.toString());
	}

	/**
	 * Set value of Custom_MFinvolved
	 * @param custom_mfinvolved
	 */
	public final void setCustom_MFinvolved(java.lang.Boolean custom_mfinvolved)
	{
		setCustom_MFinvolved(getContext(), custom_mfinvolved);
	}

	/**
	 * Set value of Custom_MFinvolved
	 * @param context
	 * @param custom_mfinvolved
	 */
	public final void setCustom_MFinvolved(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean custom_mfinvolved)
	{
		getMendixObject().setValue(context, MemberNames.Custom_MFinvolved.toString(), custom_mfinvolved);
	}

	/**
	 * @return value of System_Description
	 */
	public final java.lang.String getSystem_Description()
	{
		return getSystem_Description(getContext());
	}

	/**
	 * @param context
	 * @return value of System_Description
	 */
	public final java.lang.String getSystem_Description(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.System_Description.toString());
	}

	/**
	 * Set value of System_Description
	 * @param system_description
	 */
	public final void setSystem_Description(java.lang.String system_description)
	{
		setSystem_Description(getContext(), system_description);
	}

	/**
	 * Set value of System_Description
	 * @param context
	 * @param system_description
	 */
	public final void setSystem_Description(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String system_description)
	{
		getMendixObject().setValue(context, MemberNames.System_Description.toString(), system_description);
	}

	/**
	 * @return value of System_Parent
	 */
	public final java.lang.Integer getSystem_Parent()
	{
		return getSystem_Parent(getContext());
	}

	/**
	 * @param context
	 * @return value of System_Parent
	 */
	public final java.lang.Integer getSystem_Parent(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.System_Parent.toString());
	}

	/**
	 * Set value of System_Parent
	 * @param system_parent
	 */
	public final void setSystem_Parent(java.lang.Integer system_parent)
	{
		setSystem_Parent(getContext(), system_parent);
	}

	/**
	 * Set value of System_Parent
	 * @param context
	 * @param system_parent
	 */
	public final void setSystem_Parent(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer system_parent)
	{
		getMendixObject().setValue(context, MemberNames.System_Parent.toString(), system_parent);
	}

	/**
	 * @return value of System_AssignedTo
	 */
	public final java.lang.String getSystem_AssignedTo()
	{
		return getSystem_AssignedTo(getContext());
	}

	/**
	 * @param context
	 * @return value of System_AssignedTo
	 */
	public final java.lang.String getSystem_AssignedTo(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.System_AssignedTo.toString());
	}

	/**
	 * Set value of System_AssignedTo
	 * @param system_assignedto
	 */
	public final void setSystem_AssignedTo(java.lang.String system_assignedto)
	{
		setSystem_AssignedTo(getContext(), system_assignedto);
	}

	/**
	 * Set value of System_AssignedTo
	 * @param context
	 * @param system_assignedto
	 */
	public final void setSystem_AssignedTo(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String system_assignedto)
	{
		getMendixObject().setValue(context, MemberNames.System_AssignedTo.toString(), system_assignedto);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Fields_9_Resource_7
	 */
	public final azureextensionmodule.proxies.Resource_7 getFields_9_Resource_7() throws com.mendix.core.CoreException
	{
		return getFields_9_Resource_7(getContext());
	}

	/**
	 * @param context
	 * @return value of Fields_9_Resource_7
	 * @throws com.mendix.core.CoreException
	 */
	public final azureextensionmodule.proxies.Resource_7 getFields_9_Resource_7(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		azureextensionmodule.proxies.Resource_7 result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Fields_9_Resource_7.toString());
		if (identifier != null) {
			result = azureextensionmodule.proxies.Resource_7.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Fields_9_Resource_7
	 * @param fields_9_resource_7
	 */
	public final void setFields_9_Resource_7(azureextensionmodule.proxies.Resource_7 fields_9_resource_7)
	{
		setFields_9_Resource_7(getContext(), fields_9_resource_7);
	}

	/**
	 * Set value of Fields_9_Resource_7
	 * @param context
	 * @param fields_9_resource_7
	 */
	public final void setFields_9_Resource_7(com.mendix.systemwideinterfaces.core.IContext context, azureextensionmodule.proxies.Resource_7 fields_9_resource_7)
	{
		if (fields_9_resource_7 == null) {
			getMendixObject().setValue(context, MemberNames.Fields_9_Resource_7.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Fields_9_Resource_7.toString(), fields_9_resource_7.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return fields_9MendixObject;
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
			final azureextensionmodule.proxies.Fields_9 that = (azureextensionmodule.proxies.Fields_9) obj;
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
