// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package azureextensionmodule.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	/**
	 * @deprecated
	 * The default constructor of the Microflows class should not be used.
	 * Use the static microflow invocation methods instead.
	 */
	@java.lang.Deprecated(since = "9.12", forRemoval = true)
	public Microflows() {}

	// These are the microflows for the AzureExtensionModule module
	public static void addUpdateWorkFlow_Azure_SharePoint(IContext context, azureextensionmodule.proxies.Root _workItemData)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("WorkItemData", _workItemData == null ? null : _workItemData.getMendixObject());
		Core.microflowCall("AzureExtensionModule.AddUpdateWorkFlow_Azure_SharePoint").withParams(params).execute(context);
	}
	public static void configureAccessTokenDetails(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("AzureExtensionModule.ConfigureAccessTokenDetails").withParams(params).execute(context);
	}
	public static void deleteToken(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("AzureExtensionModule.DeleteToken").withParams(params).execute(context);
	}
	public static void dummyMicroflowToSubsidiseMicroflow(IContext context, azureextensionmodule.proxies.SharePointData _sharePointData, azureextensionmodule.proxies.SharePointData _sharePointDataOfRules, azureextensionmodule.proxies.Cofiguration _tokenConfiguration)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SharePointData", _sharePointData == null ? null : _sharePointData.getMendixObject());
		params.put("SharePointDataOfRules", _sharePointDataOfRules == null ? null : _sharePointDataOfRules.getMendixObject());
		params.put("TokenConfiguration", _tokenConfiguration == null ? null : _tokenConfiguration.getMendixObject());
		Core.microflowCall("AzureExtensionModule.DummyMicroflowToSubsidiseMicroflow").withParams(params).execute(context);
	}
	public static void generateSharePointToken(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("AzureExtensionModule.GenerateSharePointToken").withParams(params).execute(context);
	}
	public static void init_WorkItem_Add_Azure_SharePoint(IContext context, azureextensionmodule.proxies.Root _workItemsData)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("WorkItemsData", _workItemsData == null ? null : _workItemsData.getMendixObject());
		Core.microflowCall("AzureExtensionModule.Init_WorkItem_Add_Azure_SharePoint").withParams(params).execute(context);
	}
	public static void modifyRequestOfPatch(IContext context, azureextensionmodule.proxies.SharePointData _sharePointData, azureextensionmodule.proxies.SharePointData _sharePointDataOfRules, azureextensionmodule.proxies.Cofiguration _tokenConfiguration)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SharePointData", _sharePointData == null ? null : _sharePointData.getMendixObject());
		params.put("SharePointDataOfRules", _sharePointDataOfRules == null ? null : _sharePointDataOfRules.getMendixObject());
		params.put("TokenConfiguration", _tokenConfiguration == null ? null : _tokenConfiguration.getMendixObject());
		Core.microflowCall("AzureExtensionModule.ModifyRequestOfPatch").withParams(params).execute(context);
	}
	public static azureextensionmodule.proxies.SharePointData modifyRulesOfeDataRecievedFromSharepoint(IContext context, azureextensionmodule.proxies.SharePointData _sharePointData)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SharePointData", _sharePointData == null ? null : _sharePointData.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("AzureExtensionModule.ModifyRulesOfeDataRecievedFromSharepoint").withParams(params).execute(context);
		return result == null ? null : azureextensionmodule.proxies.SharePointData.initialize(context, result);
	}
	public static void postGetMFIdFromSharepoint(IContext context, azureextensionmodule.proxies.SharePointData _sharePointData)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SharePointData", _sharePointData == null ? null : _sharePointData.getMendixObject());
		Core.microflowCall("AzureExtensionModule.PostGetMFIdFromSharepoint").withParams(params).execute(context);
	}
}