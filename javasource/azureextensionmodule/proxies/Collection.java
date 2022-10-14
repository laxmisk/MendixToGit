// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package azureextensionmodule.proxies;

public class Collection
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject collectionMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AzureExtensionModule.Collection";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		_id("_id"),
		BaseUrl("BaseUrl"),
		Collection_ResourceContainers("AzureExtensionModule.Collection_ResourceContainers");

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

	public Collection(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Collection(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject collectionMendixObject)
	{
		if (collectionMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, collectionMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.collectionMendixObject = collectionMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Collection.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static azureextensionmodule.proxies.Collection initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return azureextensionmodule.proxies.Collection.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static azureextensionmodule.proxies.Collection initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new azureextensionmodule.proxies.Collection(context, mendixObject);
	}

	public static azureextensionmodule.proxies.Collection load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return azureextensionmodule.proxies.Collection.initialize(context, mendixObject);
	}

	public static java.util.List<azureextensionmodule.proxies.Collection> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> azureextensionmodule.proxies.Collection.initialize(context, obj))
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
	 * @throws com.mendix.core.CoreException
	 * @return value of Collection_ResourceContainers
	 */
	public final azureextensionmodule.proxies.ResourceContainers getCollection_ResourceContainers() throws com.mendix.core.CoreException
	{
		return getCollection_ResourceContainers(getContext());
	}

	/**
	 * @param context
	 * @return value of Collection_ResourceContainers
	 * @throws com.mendix.core.CoreException
	 */
	public final azureextensionmodule.proxies.ResourceContainers getCollection_ResourceContainers(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		azureextensionmodule.proxies.ResourceContainers result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Collection_ResourceContainers.toString());
		if (identifier != null) {
			result = azureextensionmodule.proxies.ResourceContainers.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Collection_ResourceContainers
	 * @param collection_resourcecontainers
	 */
	public final void setCollection_ResourceContainers(azureextensionmodule.proxies.ResourceContainers collection_resourcecontainers)
	{
		setCollection_ResourceContainers(getContext(), collection_resourcecontainers);
	}

	/**
	 * Set value of Collection_ResourceContainers
	 * @param context
	 * @param collection_resourcecontainers
	 */
	public final void setCollection_ResourceContainers(com.mendix.systemwideinterfaces.core.IContext context, azureextensionmodule.proxies.ResourceContainers collection_resourcecontainers)
	{
		if (collection_resourcecontainers == null) {
			getMendixObject().setValue(context, MemberNames.Collection_ResourceContainers.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Collection_ResourceContainers.toString(), collection_resourcecontainers.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return collectionMendixObject;
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
			final azureextensionmodule.proxies.Collection that = (azureextensionmodule.proxies.Collection) obj;
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