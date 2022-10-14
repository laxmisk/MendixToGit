// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package azureextensionmodule.proxies;

public class _links
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject _linksMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AzureExtensionModule._links";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Avatar__links("AzureExtensionModule.Avatar__links"),
		_links_RevisedBy("AzureExtensionModule._links_RevisedBy"),
		_links_Resource_7("AzureExtensionModule._links_Resource_7"),
		Self__links("AzureExtensionModule.Self__links"),
		WorkItemUpdates__links("AzureExtensionModule.WorkItemUpdates__links"),
		WorkItemRevisions__links("AzureExtensionModule.WorkItemRevisions__links"),
		WorkItemComments__links("AzureExtensionModule.WorkItemComments__links"),
		Html__links("AzureExtensionModule.Html__links"),
		WorkItemType__links("AzureExtensionModule.WorkItemType__links"),
		Fields_2__links("AzureExtensionModule.Fields_2__links");

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

	public _links(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected _links(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject _linksMendixObject)
	{
		if (_linksMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, _linksMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this._linksMendixObject = _linksMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use '_links.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static azureextensionmodule.proxies._links initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return azureextensionmodule.proxies._links.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static azureextensionmodule.proxies._links initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new azureextensionmodule.proxies._links(context, mendixObject);
	}

	public static azureextensionmodule.proxies._links load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return azureextensionmodule.proxies._links.initialize(context, mendixObject);
	}

	public static java.util.List<azureextensionmodule.proxies._links> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> azureextensionmodule.proxies._links.initialize(context, obj))
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
	 * @throws com.mendix.core.CoreException
	 * @return value of Avatar__links
	 */
	public final azureextensionmodule.proxies.Avatar getAvatar__links() throws com.mendix.core.CoreException
	{
		return getAvatar__links(getContext());
	}

	/**
	 * @param context
	 * @return value of Avatar__links
	 * @throws com.mendix.core.CoreException
	 */
	public final azureextensionmodule.proxies.Avatar getAvatar__links(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		azureextensionmodule.proxies.Avatar result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Avatar__links.toString());
		if (identifier != null) {
			result = azureextensionmodule.proxies.Avatar.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Avatar__links
	 * @param avatar__links
	 */
	public final void setAvatar__links(azureextensionmodule.proxies.Avatar avatar__links)
	{
		setAvatar__links(getContext(), avatar__links);
	}

	/**
	 * Set value of Avatar__links
	 * @param context
	 * @param avatar__links
	 */
	public final void setAvatar__links(com.mendix.systemwideinterfaces.core.IContext context, azureextensionmodule.proxies.Avatar avatar__links)
	{
		if (avatar__links == null) {
			getMendixObject().setValue(context, MemberNames.Avatar__links.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Avatar__links.toString(), avatar__links.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of _links_RevisedBy
	 */
	public final azureextensionmodule.proxies.RevisedBy get_links_RevisedBy() throws com.mendix.core.CoreException
	{
		return get_links_RevisedBy(getContext());
	}

	/**
	 * @param context
	 * @return value of _links_RevisedBy
	 * @throws com.mendix.core.CoreException
	 */
	public final azureextensionmodule.proxies.RevisedBy get_links_RevisedBy(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		azureextensionmodule.proxies.RevisedBy result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames._links_RevisedBy.toString());
		if (identifier != null) {
			result = azureextensionmodule.proxies.RevisedBy.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of _links_RevisedBy
	 * @param _links_revisedby
	 */
	public final void set_links_RevisedBy(azureextensionmodule.proxies.RevisedBy _links_revisedby)
	{
		set_links_RevisedBy(getContext(), _links_revisedby);
	}

	/**
	 * Set value of _links_RevisedBy
	 * @param context
	 * @param _links_revisedby
	 */
	public final void set_links_RevisedBy(com.mendix.systemwideinterfaces.core.IContext context, azureextensionmodule.proxies.RevisedBy _links_revisedby)
	{
		if (_links_revisedby == null) {
			getMendixObject().setValue(context, MemberNames._links_RevisedBy.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames._links_RevisedBy.toString(), _links_revisedby.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of _links_Resource_7
	 */
	public final azureextensionmodule.proxies.Resource_7 get_links_Resource_7() throws com.mendix.core.CoreException
	{
		return get_links_Resource_7(getContext());
	}

	/**
	 * @param context
	 * @return value of _links_Resource_7
	 * @throws com.mendix.core.CoreException
	 */
	public final azureextensionmodule.proxies.Resource_7 get_links_Resource_7(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		azureextensionmodule.proxies.Resource_7 result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames._links_Resource_7.toString());
		if (identifier != null) {
			result = azureextensionmodule.proxies.Resource_7.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of _links_Resource_7
	 * @param _links_resource_7
	 */
	public final void set_links_Resource_7(azureextensionmodule.proxies.Resource_7 _links_resource_7)
	{
		set_links_Resource_7(getContext(), _links_resource_7);
	}

	/**
	 * Set value of _links_Resource_7
	 * @param context
	 * @param _links_resource_7
	 */
	public final void set_links_Resource_7(com.mendix.systemwideinterfaces.core.IContext context, azureextensionmodule.proxies.Resource_7 _links_resource_7)
	{
		if (_links_resource_7 == null) {
			getMendixObject().setValue(context, MemberNames._links_Resource_7.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames._links_Resource_7.toString(), _links_resource_7.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Self__links
	 */
	public final azureextensionmodule.proxies.Self getSelf__links() throws com.mendix.core.CoreException
	{
		return getSelf__links(getContext());
	}

	/**
	 * @param context
	 * @return value of Self__links
	 * @throws com.mendix.core.CoreException
	 */
	public final azureextensionmodule.proxies.Self getSelf__links(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		azureextensionmodule.proxies.Self result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Self__links.toString());
		if (identifier != null) {
			result = azureextensionmodule.proxies.Self.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Self__links
	 * @param self__links
	 */
	public final void setSelf__links(azureextensionmodule.proxies.Self self__links)
	{
		setSelf__links(getContext(), self__links);
	}

	/**
	 * Set value of Self__links
	 * @param context
	 * @param self__links
	 */
	public final void setSelf__links(com.mendix.systemwideinterfaces.core.IContext context, azureextensionmodule.proxies.Self self__links)
	{
		if (self__links == null) {
			getMendixObject().setValue(context, MemberNames.Self__links.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Self__links.toString(), self__links.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of WorkItemUpdates__links
	 */
	public final azureextensionmodule.proxies.WorkItemUpdates getWorkItemUpdates__links() throws com.mendix.core.CoreException
	{
		return getWorkItemUpdates__links(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkItemUpdates__links
	 * @throws com.mendix.core.CoreException
	 */
	public final azureextensionmodule.proxies.WorkItemUpdates getWorkItemUpdates__links(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		azureextensionmodule.proxies.WorkItemUpdates result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkItemUpdates__links.toString());
		if (identifier != null) {
			result = azureextensionmodule.proxies.WorkItemUpdates.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of WorkItemUpdates__links
	 * @param workitemupdates__links
	 */
	public final void setWorkItemUpdates__links(azureextensionmodule.proxies.WorkItemUpdates workitemupdates__links)
	{
		setWorkItemUpdates__links(getContext(), workitemupdates__links);
	}

	/**
	 * Set value of WorkItemUpdates__links
	 * @param context
	 * @param workitemupdates__links
	 */
	public final void setWorkItemUpdates__links(com.mendix.systemwideinterfaces.core.IContext context, azureextensionmodule.proxies.WorkItemUpdates workitemupdates__links)
	{
		if (workitemupdates__links == null) {
			getMendixObject().setValue(context, MemberNames.WorkItemUpdates__links.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.WorkItemUpdates__links.toString(), workitemupdates__links.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of WorkItemRevisions__links
	 */
	public final azureextensionmodule.proxies.WorkItemRevisions getWorkItemRevisions__links() throws com.mendix.core.CoreException
	{
		return getWorkItemRevisions__links(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkItemRevisions__links
	 * @throws com.mendix.core.CoreException
	 */
	public final azureextensionmodule.proxies.WorkItemRevisions getWorkItemRevisions__links(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		azureextensionmodule.proxies.WorkItemRevisions result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkItemRevisions__links.toString());
		if (identifier != null) {
			result = azureextensionmodule.proxies.WorkItemRevisions.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of WorkItemRevisions__links
	 * @param workitemrevisions__links
	 */
	public final void setWorkItemRevisions__links(azureextensionmodule.proxies.WorkItemRevisions workitemrevisions__links)
	{
		setWorkItemRevisions__links(getContext(), workitemrevisions__links);
	}

	/**
	 * Set value of WorkItemRevisions__links
	 * @param context
	 * @param workitemrevisions__links
	 */
	public final void setWorkItemRevisions__links(com.mendix.systemwideinterfaces.core.IContext context, azureextensionmodule.proxies.WorkItemRevisions workitemrevisions__links)
	{
		if (workitemrevisions__links == null) {
			getMendixObject().setValue(context, MemberNames.WorkItemRevisions__links.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.WorkItemRevisions__links.toString(), workitemrevisions__links.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of WorkItemComments__links
	 */
	public final azureextensionmodule.proxies.WorkItemComments getWorkItemComments__links() throws com.mendix.core.CoreException
	{
		return getWorkItemComments__links(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkItemComments__links
	 * @throws com.mendix.core.CoreException
	 */
	public final azureextensionmodule.proxies.WorkItemComments getWorkItemComments__links(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		azureextensionmodule.proxies.WorkItemComments result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkItemComments__links.toString());
		if (identifier != null) {
			result = azureextensionmodule.proxies.WorkItemComments.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of WorkItemComments__links
	 * @param workitemcomments__links
	 */
	public final void setWorkItemComments__links(azureextensionmodule.proxies.WorkItemComments workitemcomments__links)
	{
		setWorkItemComments__links(getContext(), workitemcomments__links);
	}

	/**
	 * Set value of WorkItemComments__links
	 * @param context
	 * @param workitemcomments__links
	 */
	public final void setWorkItemComments__links(com.mendix.systemwideinterfaces.core.IContext context, azureextensionmodule.proxies.WorkItemComments workitemcomments__links)
	{
		if (workitemcomments__links == null) {
			getMendixObject().setValue(context, MemberNames.WorkItemComments__links.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.WorkItemComments__links.toString(), workitemcomments__links.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Html__links
	 */
	public final azureextensionmodule.proxies.Html getHtml__links() throws com.mendix.core.CoreException
	{
		return getHtml__links(getContext());
	}

	/**
	 * @param context
	 * @return value of Html__links
	 * @throws com.mendix.core.CoreException
	 */
	public final azureextensionmodule.proxies.Html getHtml__links(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		azureextensionmodule.proxies.Html result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Html__links.toString());
		if (identifier != null) {
			result = azureextensionmodule.proxies.Html.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Html__links
	 * @param html__links
	 */
	public final void setHtml__links(azureextensionmodule.proxies.Html html__links)
	{
		setHtml__links(getContext(), html__links);
	}

	/**
	 * Set value of Html__links
	 * @param context
	 * @param html__links
	 */
	public final void setHtml__links(com.mendix.systemwideinterfaces.core.IContext context, azureextensionmodule.proxies.Html html__links)
	{
		if (html__links == null) {
			getMendixObject().setValue(context, MemberNames.Html__links.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Html__links.toString(), html__links.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of WorkItemType__links
	 */
	public final azureextensionmodule.proxies.WorkItemType getWorkItemType__links() throws com.mendix.core.CoreException
	{
		return getWorkItemType__links(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkItemType__links
	 * @throws com.mendix.core.CoreException
	 */
	public final azureextensionmodule.proxies.WorkItemType getWorkItemType__links(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		azureextensionmodule.proxies.WorkItemType result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkItemType__links.toString());
		if (identifier != null) {
			result = azureextensionmodule.proxies.WorkItemType.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of WorkItemType__links
	 * @param workitemtype__links
	 */
	public final void setWorkItemType__links(azureextensionmodule.proxies.WorkItemType workitemtype__links)
	{
		setWorkItemType__links(getContext(), workitemtype__links);
	}

	/**
	 * Set value of WorkItemType__links
	 * @param context
	 * @param workitemtype__links
	 */
	public final void setWorkItemType__links(com.mendix.systemwideinterfaces.core.IContext context, azureextensionmodule.proxies.WorkItemType workitemtype__links)
	{
		if (workitemtype__links == null) {
			getMendixObject().setValue(context, MemberNames.WorkItemType__links.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.WorkItemType__links.toString(), workitemtype__links.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Fields_2__links
	 */
	public final azureextensionmodule.proxies.Fields_2 getFields_2__links() throws com.mendix.core.CoreException
	{
		return getFields_2__links(getContext());
	}

	/**
	 * @param context
	 * @return value of Fields_2__links
	 * @throws com.mendix.core.CoreException
	 */
	public final azureextensionmodule.proxies.Fields_2 getFields_2__links(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		azureextensionmodule.proxies.Fields_2 result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Fields_2__links.toString());
		if (identifier != null) {
			result = azureextensionmodule.proxies.Fields_2.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Fields_2__links
	 * @param fields_2__links
	 */
	public final void setFields_2__links(azureextensionmodule.proxies.Fields_2 fields_2__links)
	{
		setFields_2__links(getContext(), fields_2__links);
	}

	/**
	 * Set value of Fields_2__links
	 * @param context
	 * @param fields_2__links
	 */
	public final void setFields_2__links(com.mendix.systemwideinterfaces.core.IContext context, azureextensionmodule.proxies.Fields_2 fields_2__links)
	{
		if (fields_2__links == null) {
			getMendixObject().setValue(context, MemberNames.Fields_2__links.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Fields_2__links.toString(), fields_2__links.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return _linksMendixObject;
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
			final azureextensionmodule.proxies._links that = (azureextensionmodule.proxies._links) obj;
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