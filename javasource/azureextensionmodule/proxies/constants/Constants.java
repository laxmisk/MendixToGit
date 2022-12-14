// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package azureextensionmodule.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	/**
	 * @deprecated
	 * The default constructor of the Constants class should not be used.
	 * Use the static get methods instead.
	 */
	@java.lang.Deprecated(since = "9.12", forRemoval = true)
	public Constants() {}

	// These are the constants for the AzureExtensionModule module

	public static java.lang.String getAzureToken()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("AzureExtensionModule.AzureToken");
	}

	public static java.lang.String getAzureURL()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("AzureExtensionModule.AzureURL");
	}

	public static java.lang.String getAzureURL_MakeReadOnly()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("AzureExtensionModule.AzureURL_MakeReadOnly");
	}

	public static java.lang.String getJsonContent()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("AzureExtensionModule.JsonContent");
	}

	public static java.lang.String getSharePoint_Update_URL()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("AzureExtensionModule.SharePoint_Update_URL");
	}

	public static java.lang.String getSharePointClientId()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("AzureExtensionModule.SharePointClientId");
	}

	public static java.lang.String getSharePointClientSecret()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("AzureExtensionModule.SharePointClientSecret");
	}

	public static java.lang.String getSharepointURL()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("AzureExtensionModule.SharepointURL");
	}
}