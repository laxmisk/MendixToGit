// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package azureextensionmodule.proxies;

public class Fields_5
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject fields_5MendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AzureExtensionModule.Fields_5";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		System_Id("System_Id"),
		System_Title("System_Title"),
		Custom_Type("Custom_Type"),
		Custom_PM200("Custom_PM200"),
		Custom_PM300Plan("Custom_PM300Plan"),
		Custom_PM300ActualorForecast("Custom_PM300ActualorForecast"),
		Custom_MFID("Custom_MFID"),
		Custom_NPItype("Custom_NPItype"),
		Custom_MFInvest("Custom_MFInvest"),
		Custom_MFHours("Custom_MFHours"),
		Custom_PM300Deviation("Custom_PM300Deviation"),
		Custom_MFinvolved("Custom_MFinvolved"),
		System_Description("System_Description"),
		Custom_SubPMP_Fields_5("AzureExtensionModule.Custom_SubPMP_Fields_5");

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

	public Fields_5(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Fields_5(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject fields_5MendixObject)
	{
		if (fields_5MendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, fields_5MendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.fields_5MendixObject = fields_5MendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Fields_5.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static azureextensionmodule.proxies.Fields_5 initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return azureextensionmodule.proxies.Fields_5.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static azureextensionmodule.proxies.Fields_5 initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new azureextensionmodule.proxies.Fields_5(context, mendixObject);
	}

	public static azureextensionmodule.proxies.Fields_5 load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return azureextensionmodule.proxies.Fields_5.initialize(context, mendixObject);
	}

	public static java.util.List<azureextensionmodule.proxies.Fields_5> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> azureextensionmodule.proxies.Fields_5.initialize(context, obj))
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
	 * @return value of Custom_MFID
	 */
	public final java.lang.String getCustom_MFID()
	{
		return getCustom_MFID(getContext());
	}

	/**
	 * @param context
	 * @return value of Custom_MFID
	 */
	public final java.lang.String getCustom_MFID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Custom_MFID.toString());
	}

	/**
	 * Set value of Custom_MFID
	 * @param custom_mfid
	 */
	public final void setCustom_MFID(java.lang.String custom_mfid)
	{
		setCustom_MFID(getContext(), custom_mfid);
	}

	/**
	 * Set value of Custom_MFID
	 * @param context
	 * @param custom_mfid
	 */
	public final void setCustom_MFID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String custom_mfid)
	{
		getMendixObject().setValue(context, MemberNames.Custom_MFID.toString(), custom_mfid);
	}

	/**
	 * @return value of Custom_NPItype
	 */
	public final java.lang.String getCustom_NPItype()
	{
		return getCustom_NPItype(getContext());
	}

	/**
	 * @param context
	 * @return value of Custom_NPItype
	 */
	public final java.lang.String getCustom_NPItype(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Custom_NPItype.toString());
	}

	/**
	 * Set value of Custom_NPItype
	 * @param custom_npitype
	 */
	public final void setCustom_NPItype(java.lang.String custom_npitype)
	{
		setCustom_NPItype(getContext(), custom_npitype);
	}

	/**
	 * Set value of Custom_NPItype
	 * @param context
	 * @param custom_npitype
	 */
	public final void setCustom_NPItype(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String custom_npitype)
	{
		getMendixObject().setValue(context, MemberNames.Custom_NPItype.toString(), custom_npitype);
	}

	/**
	 * @return value of Custom_MFInvest
	 */
	public final java.math.BigDecimal getCustom_MFInvest()
	{
		return getCustom_MFInvest(getContext());
	}

	/**
	 * @param context
	 * @return value of Custom_MFInvest
	 */
	public final java.math.BigDecimal getCustom_MFInvest(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Custom_MFInvest.toString());
	}

	/**
	 * Set value of Custom_MFInvest
	 * @param custom_mfinvest
	 */
	public final void setCustom_MFInvest(java.math.BigDecimal custom_mfinvest)
	{
		setCustom_MFInvest(getContext(), custom_mfinvest);
	}

	/**
	 * Set value of Custom_MFInvest
	 * @param context
	 * @param custom_mfinvest
	 */
	public final void setCustom_MFInvest(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal custom_mfinvest)
	{
		getMendixObject().setValue(context, MemberNames.Custom_MFInvest.toString(), custom_mfinvest);
	}

	/**
	 * @return value of Custom_MFHours
	 */
	public final java.math.BigDecimal getCustom_MFHours()
	{
		return getCustom_MFHours(getContext());
	}

	/**
	 * @param context
	 * @return value of Custom_MFHours
	 */
	public final java.math.BigDecimal getCustom_MFHours(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Custom_MFHours.toString());
	}

	/**
	 * Set value of Custom_MFHours
	 * @param custom_mfhours
	 */
	public final void setCustom_MFHours(java.math.BigDecimal custom_mfhours)
	{
		setCustom_MFHours(getContext(), custom_mfhours);
	}

	/**
	 * Set value of Custom_MFHours
	 * @param context
	 * @param custom_mfhours
	 */
	public final void setCustom_MFHours(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal custom_mfhours)
	{
		getMendixObject().setValue(context, MemberNames.Custom_MFHours.toString(), custom_mfhours);
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
	 * @throws com.mendix.core.CoreException
	 * @return value of Custom_SubPMP_Fields_5
	 */
	public final azureextensionmodule.proxies.Custom_SubPMP getCustom_SubPMP_Fields_5() throws com.mendix.core.CoreException
	{
		return getCustom_SubPMP_Fields_5(getContext());
	}

	/**
	 * @param context
	 * @return value of Custom_SubPMP_Fields_5
	 * @throws com.mendix.core.CoreException
	 */
	public final azureextensionmodule.proxies.Custom_SubPMP getCustom_SubPMP_Fields_5(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		azureextensionmodule.proxies.Custom_SubPMP result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Custom_SubPMP_Fields_5.toString());
		if (identifier != null) {
			result = azureextensionmodule.proxies.Custom_SubPMP.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Custom_SubPMP_Fields_5
	 * @param custom_subpmp_fields_5
	 */
	public final void setCustom_SubPMP_Fields_5(azureextensionmodule.proxies.Custom_SubPMP custom_subpmp_fields_5)
	{
		setCustom_SubPMP_Fields_5(getContext(), custom_subpmp_fields_5);
	}

	/**
	 * Set value of Custom_SubPMP_Fields_5
	 * @param context
	 * @param custom_subpmp_fields_5
	 */
	public final void setCustom_SubPMP_Fields_5(com.mendix.systemwideinterfaces.core.IContext context, azureextensionmodule.proxies.Custom_SubPMP custom_subpmp_fields_5)
	{
		if (custom_subpmp_fields_5 == null) {
			getMendixObject().setValue(context, MemberNames.Custom_SubPMP_Fields_5.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Custom_SubPMP_Fields_5.toString(), custom_subpmp_fields_5.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return fields_5MendixObject;
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
			final azureextensionmodule.proxies.Fields_5 that = (azureextensionmodule.proxies.Fields_5) obj;
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
