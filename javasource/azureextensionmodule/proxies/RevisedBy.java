// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package azureextensionmodule.proxies;

public class RevisedBy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject revisedByMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AzureExtensionModule.RevisedBy";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		_id("_id"),
		Name("Name"),
		DisplayName("DisplayName"),
		Url("Url"),
		UniqueName("UniqueName"),
		ImageUrl("ImageUrl"),
		Descriptor("Descriptor"),
		RevisedBy_Resource_4("AzureExtensionModule.RevisedBy_Resource_4"),
		_links_RevisedBy("AzureExtensionModule._links_RevisedBy"),
		RevisedBy_Resource_6("AzureExtensionModule.RevisedBy_Resource_6");

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

	public RevisedBy(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected RevisedBy(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject revisedByMendixObject)
	{
		if (revisedByMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, revisedByMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.revisedByMendixObject = revisedByMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'RevisedBy.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static azureextensionmodule.proxies.RevisedBy initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return azureextensionmodule.proxies.RevisedBy.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static azureextensionmodule.proxies.RevisedBy initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new azureextensionmodule.proxies.RevisedBy(context, mendixObject);
	}

	public static azureextensionmodule.proxies.RevisedBy load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return azureextensionmodule.proxies.RevisedBy.initialize(context, mendixObject);
	}

	public static java.util.List<azureextensionmodule.proxies.RevisedBy> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> azureextensionmodule.proxies.RevisedBy.initialize(context, obj))
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
	 * @return value of _id
	 */
	public final java.lang.String get_id()
	{
		return get_id(getContext());
	}

	/**
	 * @param context
	 * @return value of _id
	 */
	public final java.lang.String get_id(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames._id.toString());
	}

	/**
	 * Set value of _id
	 * @param _id
	 */
	public final void set_id(java.lang.String _id)
	{
		set_id(getContext(), _id);
	}

	/**
	 * Set value of _id
	 * @param context
	 * @param _id
	 */
	public final void set_id(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String _id)
	{
		getMendixObject().setValue(context, MemberNames._id.toString(), _id);
	}

	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of DisplayName
	 */
	public final java.lang.String getDisplayName()
	{
		return getDisplayName(getContext());
	}

	/**
	 * @param context
	 * @return value of DisplayName
	 */
	public final java.lang.String getDisplayName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DisplayName.toString());
	}

	/**
	 * Set value of DisplayName
	 * @param displayname
	 */
	public final void setDisplayName(java.lang.String displayname)
	{
		setDisplayName(getContext(), displayname);
	}

	/**
	 * Set value of DisplayName
	 * @param context
	 * @param displayname
	 */
	public final void setDisplayName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String displayname)
	{
		getMendixObject().setValue(context, MemberNames.DisplayName.toString(), displayname);
	}

	/**
	 * @return value of Url
	 */
	public final java.lang.String getUrl()
	{
		return getUrl(getContext());
	}

	/**
	 * @param context
	 * @return value of Url
	 */
	public final java.lang.String getUrl(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Url.toString());
	}

	/**
	 * Set value of Url
	 * @param url
	 */
	public final void setUrl(java.lang.String url)
	{
		setUrl(getContext(), url);
	}

	/**
	 * Set value of Url
	 * @param context
	 * @param url
	 */
	public final void setUrl(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String url)
	{
		getMendixObject().setValue(context, MemberNames.Url.toString(), url);
	}

	/**
	 * @return value of UniqueName
	 */
	public final java.lang.String getUniqueName()
	{
		return getUniqueName(getContext());
	}

	/**
	 * @param context
	 * @return value of UniqueName
	 */
	public final java.lang.String getUniqueName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.UniqueName.toString());
	}

	/**
	 * Set value of UniqueName
	 * @param uniquename
	 */
	public final void setUniqueName(java.lang.String uniquename)
	{
		setUniqueName(getContext(), uniquename);
	}

	/**
	 * Set value of UniqueName
	 * @param context
	 * @param uniquename
	 */
	public final void setUniqueName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String uniquename)
	{
		getMendixObject().setValue(context, MemberNames.UniqueName.toString(), uniquename);
	}

	/**
	 * @return value of ImageUrl
	 */
	public final java.lang.String getImageUrl()
	{
		return getImageUrl(getContext());
	}

	/**
	 * @param context
	 * @return value of ImageUrl
	 */
	public final java.lang.String getImageUrl(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ImageUrl.toString());
	}

	/**
	 * Set value of ImageUrl
	 * @param imageurl
	 */
	public final void setImageUrl(java.lang.String imageurl)
	{
		setImageUrl(getContext(), imageurl);
	}

	/**
	 * Set value of ImageUrl
	 * @param context
	 * @param imageurl
	 */
	public final void setImageUrl(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String imageurl)
	{
		getMendixObject().setValue(context, MemberNames.ImageUrl.toString(), imageurl);
	}

	/**
	 * @return value of Descriptor
	 */
	public final java.lang.String getDescriptor()
	{
		return getDescriptor(getContext());
	}

	/**
	 * @param context
	 * @return value of Descriptor
	 */
	public final java.lang.String getDescriptor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Descriptor.toString());
	}

	/**
	 * Set value of Descriptor
	 * @param descriptor
	 */
	public final void setDescriptor(java.lang.String descriptor)
	{
		setDescriptor(getContext(), descriptor);
	}

	/**
	 * Set value of Descriptor
	 * @param context
	 * @param descriptor
	 */
	public final void setDescriptor(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String descriptor)
	{
		getMendixObject().setValue(context, MemberNames.Descriptor.toString(), descriptor);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of RevisedBy_Resource_4
	 */
	public final azureextensionmodule.proxies.Resource_4 getRevisedBy_Resource_4() throws com.mendix.core.CoreException
	{
		return getRevisedBy_Resource_4(getContext());
	}

	/**
	 * @param context
	 * @return value of RevisedBy_Resource_4
	 * @throws com.mendix.core.CoreException
	 */
	public final azureextensionmodule.proxies.Resource_4 getRevisedBy_Resource_4(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		azureextensionmodule.proxies.Resource_4 result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.RevisedBy_Resource_4.toString());
		if (identifier != null) {
			result = azureextensionmodule.proxies.Resource_4.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of RevisedBy_Resource_4
	 * @param revisedby_resource_4
	 */
	public final void setRevisedBy_Resource_4(azureextensionmodule.proxies.Resource_4 revisedby_resource_4)
	{
		setRevisedBy_Resource_4(getContext(), revisedby_resource_4);
	}

	/**
	 * Set value of RevisedBy_Resource_4
	 * @param context
	 * @param revisedby_resource_4
	 */
	public final void setRevisedBy_Resource_4(com.mendix.systemwideinterfaces.core.IContext context, azureextensionmodule.proxies.Resource_4 revisedby_resource_4)
	{
		if (revisedby_resource_4 == null) {
			getMendixObject().setValue(context, MemberNames.RevisedBy_Resource_4.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.RevisedBy_Resource_4.toString(), revisedby_resource_4.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of _links_RevisedBy
	 */
	public final azureextensionmodule.proxies._links get_links_RevisedBy() throws com.mendix.core.CoreException
	{
		return get_links_RevisedBy(getContext());
	}

	/**
	 * @param context
	 * @return value of _links_RevisedBy
	 * @throws com.mendix.core.CoreException
	 */
	public final azureextensionmodule.proxies._links get_links_RevisedBy(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		azureextensionmodule.proxies._links result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames._links_RevisedBy.toString());
		if (identifier != null) {
			result = azureextensionmodule.proxies._links.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of _links_RevisedBy
	 * @param _links_revisedby
	 */
	public final void set_links_RevisedBy(azureextensionmodule.proxies._links _links_revisedby)
	{
		set_links_RevisedBy(getContext(), _links_revisedby);
	}

	/**
	 * Set value of _links_RevisedBy
	 * @param context
	 * @param _links_revisedby
	 */
	public final void set_links_RevisedBy(com.mendix.systemwideinterfaces.core.IContext context, azureextensionmodule.proxies._links _links_revisedby)
	{
		if (_links_revisedby == null) {
			getMendixObject().setValue(context, MemberNames._links_RevisedBy.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames._links_RevisedBy.toString(), _links_revisedby.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of RevisedBy_Resource_6
	 */
	public final azureextensionmodule.proxies.Resource_6 getRevisedBy_Resource_6() throws com.mendix.core.CoreException
	{
		return getRevisedBy_Resource_6(getContext());
	}

	/**
	 * @param context
	 * @return value of RevisedBy_Resource_6
	 * @throws com.mendix.core.CoreException
	 */
	public final azureextensionmodule.proxies.Resource_6 getRevisedBy_Resource_6(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		azureextensionmodule.proxies.Resource_6 result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.RevisedBy_Resource_6.toString());
		if (identifier != null) {
			result = azureextensionmodule.proxies.Resource_6.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of RevisedBy_Resource_6
	 * @param revisedby_resource_6
	 */
	public final void setRevisedBy_Resource_6(azureextensionmodule.proxies.Resource_6 revisedby_resource_6)
	{
		setRevisedBy_Resource_6(getContext(), revisedby_resource_6);
	}

	/**
	 * Set value of RevisedBy_Resource_6
	 * @param context
	 * @param revisedby_resource_6
	 */
	public final void setRevisedBy_Resource_6(com.mendix.systemwideinterfaces.core.IContext context, azureextensionmodule.proxies.Resource_6 revisedby_resource_6)
	{
		if (revisedby_resource_6 == null) {
			getMendixObject().setValue(context, MemberNames.RevisedBy_Resource_6.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.RevisedBy_Resource_6.toString(), revisedby_resource_6.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return revisedByMendixObject;
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
			final azureextensionmodule.proxies.RevisedBy that = (azureextensionmodule.proxies.RevisedBy) obj;
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
