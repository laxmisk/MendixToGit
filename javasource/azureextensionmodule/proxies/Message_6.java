// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package azureextensionmodule.proxies;

public class Message_6
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject message_6MendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AzureExtensionModule.Message_6";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Text("Text"),
		Html("Html"),
		Markdown("Markdown"),
		Message_6_Root("AzureExtensionModule.Message_6_Root");

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

	public Message_6(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Message_6(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject message_6MendixObject)
	{
		if (message_6MendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, message_6MendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.message_6MendixObject = message_6MendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Message_6.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static azureextensionmodule.proxies.Message_6 initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return azureextensionmodule.proxies.Message_6.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static azureextensionmodule.proxies.Message_6 initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new azureextensionmodule.proxies.Message_6(context, mendixObject);
	}

	public static azureextensionmodule.proxies.Message_6 load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return azureextensionmodule.proxies.Message_6.initialize(context, mendixObject);
	}

	public static java.util.List<azureextensionmodule.proxies.Message_6> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> azureextensionmodule.proxies.Message_6.initialize(context, obj))
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
	 * @return value of Text
	 */
	public final java.lang.String getText()
	{
		return getText(getContext());
	}

	/**
	 * @param context
	 * @return value of Text
	 */
	public final java.lang.String getText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Text.toString());
	}

	/**
	 * Set value of Text
	 * @param text
	 */
	public final void setText(java.lang.String text)
	{
		setText(getContext(), text);
	}

	/**
	 * Set value of Text
	 * @param context
	 * @param text
	 */
	public final void setText(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String text)
	{
		getMendixObject().setValue(context, MemberNames.Text.toString(), text);
	}

	/**
	 * @return value of Html
	 */
	public final java.lang.String getHtml()
	{
		return getHtml(getContext());
	}

	/**
	 * @param context
	 * @return value of Html
	 */
	public final java.lang.String getHtml(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Html.toString());
	}

	/**
	 * Set value of Html
	 * @param html
	 */
	public final void setHtml(java.lang.String html)
	{
		setHtml(getContext(), html);
	}

	/**
	 * Set value of Html
	 * @param context
	 * @param html
	 */
	public final void setHtml(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String html)
	{
		getMendixObject().setValue(context, MemberNames.Html.toString(), html);
	}

	/**
	 * @return value of Markdown
	 */
	public final java.lang.String getMarkdown()
	{
		return getMarkdown(getContext());
	}

	/**
	 * @param context
	 * @return value of Markdown
	 */
	public final java.lang.String getMarkdown(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Markdown.toString());
	}

	/**
	 * Set value of Markdown
	 * @param markdown
	 */
	public final void setMarkdown(java.lang.String markdown)
	{
		setMarkdown(getContext(), markdown);
	}

	/**
	 * Set value of Markdown
	 * @param context
	 * @param markdown
	 */
	public final void setMarkdown(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String markdown)
	{
		getMendixObject().setValue(context, MemberNames.Markdown.toString(), markdown);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Message_6_Root
	 */
	public final azureextensionmodule.proxies.Root getMessage_6_Root() throws com.mendix.core.CoreException
	{
		return getMessage_6_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of Message_6_Root
	 * @throws com.mendix.core.CoreException
	 */
	public final azureextensionmodule.proxies.Root getMessage_6_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		azureextensionmodule.proxies.Root result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Message_6_Root.toString());
		if (identifier != null) {
			result = azureextensionmodule.proxies.Root.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Message_6_Root
	 * @param message_6_root
	 */
	public final void setMessage_6_Root(azureextensionmodule.proxies.Root message_6_root)
	{
		setMessage_6_Root(getContext(), message_6_root);
	}

	/**
	 * Set value of Message_6_Root
	 * @param context
	 * @param message_6_root
	 */
	public final void setMessage_6_Root(com.mendix.systemwideinterfaces.core.IContext context, azureextensionmodule.proxies.Root message_6_root)
	{
		if (message_6_root == null) {
			getMendixObject().setValue(context, MemberNames.Message_6_Root.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Message_6_Root.toString(), message_6_root.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return message_6MendixObject;
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
			final azureextensionmodule.proxies.Message_6 that = (azureextensionmodule.proxies.Message_6) obj;
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
