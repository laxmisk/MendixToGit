// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package azureextensionmodule.proxies;

public class Html
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject htmlMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AzureExtensionModule.Html";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Href("Href"),
		Html__links_2("AzureExtensionModule.Html__links_2"),
		Html__links("AzureExtensionModule.Html__links");

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

	public Html(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Html(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject htmlMendixObject)
	{
		if (htmlMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, htmlMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.htmlMendixObject = htmlMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Html.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static azureextensionmodule.proxies.Html initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return azureextensionmodule.proxies.Html.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static azureextensionmodule.proxies.Html initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new azureextensionmodule.proxies.Html(context, mendixObject);
	}

	public static azureextensionmodule.proxies.Html load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return azureextensionmodule.proxies.Html.initialize(context, mendixObject);
	}

	public static java.util.List<azureextensionmodule.proxies.Html> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> azureextensionmodule.proxies.Html.initialize(context, obj))
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
	 * @return value of Href
	 */
	public final java.lang.String getHref()
	{
		return getHref(getContext());
	}

	/**
	 * @param context
	 * @return value of Href
	 */
	public final java.lang.String getHref(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Href.toString());
	}

	/**
	 * Set value of Href
	 * @param href
	 */
	public final void setHref(java.lang.String href)
	{
		setHref(getContext(), href);
	}

	/**
	 * Set value of Href
	 * @param context
	 * @param href
	 */
	public final void setHref(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String href)
	{
		getMendixObject().setValue(context, MemberNames.Href.toString(), href);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Html__links_2
	 */
	public final azureextensionmodule.proxies._links_2 getHtml__links_2() throws com.mendix.core.CoreException
	{
		return getHtml__links_2(getContext());
	}

	/**
	 * @param context
	 * @return value of Html__links_2
	 * @throws com.mendix.core.CoreException
	 */
	public final azureextensionmodule.proxies._links_2 getHtml__links_2(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		azureextensionmodule.proxies._links_2 result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Html__links_2.toString());
		if (identifier != null) {
			result = azureextensionmodule.proxies._links_2.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Html__links_2
	 * @param html__links_2
	 */
	public final void setHtml__links_2(azureextensionmodule.proxies._links_2 html__links_2)
	{
		setHtml__links_2(getContext(), html__links_2);
	}

	/**
	 * Set value of Html__links_2
	 * @param context
	 * @param html__links_2
	 */
	public final void setHtml__links_2(com.mendix.systemwideinterfaces.core.IContext context, azureextensionmodule.proxies._links_2 html__links_2)
	{
		if (html__links_2 == null) {
			getMendixObject().setValue(context, MemberNames.Html__links_2.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Html__links_2.toString(), html__links_2.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Html__links
	 */
	public final azureextensionmodule.proxies._links getHtml__links() throws com.mendix.core.CoreException
	{
		return getHtml__links(getContext());
	}

	/**
	 * @param context
	 * @return value of Html__links
	 * @throws com.mendix.core.CoreException
	 */
	public final azureextensionmodule.proxies._links getHtml__links(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		azureextensionmodule.proxies._links result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Html__links.toString());
		if (identifier != null) {
			result = azureextensionmodule.proxies._links.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Html__links
	 * @param html__links
	 */
	public final void setHtml__links(azureextensionmodule.proxies._links html__links)
	{
		setHtml__links(getContext(), html__links);
	}

	/**
	 * Set value of Html__links
	 * @param context
	 * @param html__links
	 */
	public final void setHtml__links(com.mendix.systemwideinterfaces.core.IContext context, azureextensionmodule.proxies._links html__links)
	{
		if (html__links == null) {
			getMendixObject().setValue(context, MemberNames.Html__links.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Html__links.toString(), html__links.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return htmlMendixObject;
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
			final azureextensionmodule.proxies.Html that = (azureextensionmodule.proxies.Html) obj;
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
