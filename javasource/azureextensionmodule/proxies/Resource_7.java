// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package azureextensionmodule.proxies;

public class Resource_7
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject resource_7MendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AzureExtensionModule.Resource_7";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		_id("_id"),
		Rev("Rev"),
		Url("Url"),
		Resource_7_Root("AzureExtensionModule.Resource_7_Root"),
		Fields_9_Resource_7("AzureExtensionModule.Fields_9_Resource_7"),
		_links_Resource_7("AzureExtensionModule._links_Resource_7");

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

	public Resource_7(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Resource_7(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject resource_7MendixObject)
	{
		if (resource_7MendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, resource_7MendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.resource_7MendixObject = resource_7MendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Resource_7.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static azureextensionmodule.proxies.Resource_7 initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return azureextensionmodule.proxies.Resource_7.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static azureextensionmodule.proxies.Resource_7 initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new azureextensionmodule.proxies.Resource_7(context, mendixObject);
	}

	public static azureextensionmodule.proxies.Resource_7 load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return azureextensionmodule.proxies.Resource_7.initialize(context, mendixObject);
	}

	public static java.util.List<azureextensionmodule.proxies.Resource_7> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> azureextensionmodule.proxies.Resource_7.initialize(context, obj))
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
	public final java.lang.Integer get_id()
	{
		return get_id(getContext());
	}

	/**
	 * @param context
	 * @return value of _id
	 */
	public final java.lang.Integer get_id(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames._id.toString());
	}

	/**
	 * Set value of _id
	 * @param _id
	 */
	public final void set_id(java.lang.Integer _id)
	{
		set_id(getContext(), _id);
	}

	/**
	 * Set value of _id
	 * @param context
	 * @param _id
	 */
	public final void set_id(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer _id)
	{
		getMendixObject().setValue(context, MemberNames._id.toString(), _id);
	}

	/**
	 * @return value of Rev
	 */
	public final java.lang.Integer getRev()
	{
		return getRev(getContext());
	}

	/**
	 * @param context
	 * @return value of Rev
	 */
	public final java.lang.Integer getRev(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Rev.toString());
	}

	/**
	 * Set value of Rev
	 * @param rev
	 */
	public final void setRev(java.lang.Integer rev)
	{
		setRev(getContext(), rev);
	}

	/**
	 * Set value of Rev
	 * @param context
	 * @param rev
	 */
	public final void setRev(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer rev)
	{
		getMendixObject().setValue(context, MemberNames.Rev.toString(), rev);
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
	 * @throws com.mendix.core.CoreException
	 * @return value of Resource_7_Root
	 */
	public final azureextensionmodule.proxies.Root getResource_7_Root() throws com.mendix.core.CoreException
	{
		return getResource_7_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of Resource_7_Root
	 * @throws com.mendix.core.CoreException
	 */
	public final azureextensionmodule.proxies.Root getResource_7_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		azureextensionmodule.proxies.Root result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Resource_7_Root.toString());
		if (identifier != null) {
			result = azureextensionmodule.proxies.Root.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Resource_7_Root
	 * @param resource_7_root
	 */
	public final void setResource_7_Root(azureextensionmodule.proxies.Root resource_7_root)
	{
		setResource_7_Root(getContext(), resource_7_root);
	}

	/**
	 * Set value of Resource_7_Root
	 * @param context
	 * @param resource_7_root
	 */
	public final void setResource_7_Root(com.mendix.systemwideinterfaces.core.IContext context, azureextensionmodule.proxies.Root resource_7_root)
	{
		if (resource_7_root == null) {
			getMendixObject().setValue(context, MemberNames.Resource_7_Root.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Resource_7_Root.toString(), resource_7_root.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Fields_9_Resource_7
	 */
	public final azureextensionmodule.proxies.Fields_9 getFields_9_Resource_7() throws com.mendix.core.CoreException
	{
		return getFields_9_Resource_7(getContext());
	}

	/**
	 * @param context
	 * @return value of Fields_9_Resource_7
	 * @throws com.mendix.core.CoreException
	 */
	public final azureextensionmodule.proxies.Fields_9 getFields_9_Resource_7(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		azureextensionmodule.proxies.Fields_9 result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Fields_9_Resource_7.toString());
		if (identifier != null) {
			result = azureextensionmodule.proxies.Fields_9.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Fields_9_Resource_7
	 * @param fields_9_resource_7
	 */
	public final void setFields_9_Resource_7(azureextensionmodule.proxies.Fields_9 fields_9_resource_7)
	{
		setFields_9_Resource_7(getContext(), fields_9_resource_7);
	}

	/**
	 * Set value of Fields_9_Resource_7
	 * @param context
	 * @param fields_9_resource_7
	 */
	public final void setFields_9_Resource_7(com.mendix.systemwideinterfaces.core.IContext context, azureextensionmodule.proxies.Fields_9 fields_9_resource_7)
	{
		if (fields_9_resource_7 == null) {
			getMendixObject().setValue(context, MemberNames.Fields_9_Resource_7.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Fields_9_Resource_7.toString(), fields_9_resource_7.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of _links_Resource_7
	 */
	public final azureextensionmodule.proxies._links get_links_Resource_7() throws com.mendix.core.CoreException
	{
		return get_links_Resource_7(getContext());
	}

	/**
	 * @param context
	 * @return value of _links_Resource_7
	 * @throws com.mendix.core.CoreException
	 */
	public final azureextensionmodule.proxies._links get_links_Resource_7(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		azureextensionmodule.proxies._links result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames._links_Resource_7.toString());
		if (identifier != null) {
			result = azureextensionmodule.proxies._links.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of _links_Resource_7
	 * @param _links_resource_7
	 */
	public final void set_links_Resource_7(azureextensionmodule.proxies._links _links_resource_7)
	{
		set_links_Resource_7(getContext(), _links_resource_7);
	}

	/**
	 * Set value of _links_Resource_7
	 * @param context
	 * @param _links_resource_7
	 */
	public final void set_links_Resource_7(com.mendix.systemwideinterfaces.core.IContext context, azureextensionmodule.proxies._links _links_resource_7)
	{
		if (_links_resource_7 == null) {
			getMendixObject().setValue(context, MemberNames._links_Resource_7.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames._links_Resource_7.toString(), _links_resource_7.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return resource_7MendixObject;
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
			final azureextensionmodule.proxies.Resource_7 that = (azureextensionmodule.proxies.Resource_7) obj;
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
