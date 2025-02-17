/**
* Bridge Server API
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* OpenAPI spec version: 0.22.11
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package org.sagebionetworks.bridge.kmm.shared.models

import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.Serializable

import kotlinx.serialization.SerialName

/**
 * A study (an outside organization providing participants for a study). 
 * @param identifier The identifier for this study.
 * @param name The name of the study.
 * @param details An in-depth description of this study for prospective participants, or to show participants after they have joined a study (the “about” screen for the study).
 * @param phase 
 * @param clientData Client data for a study should be in a syntactically valid JSON format. It will be returned as is to the client (as JSON). It can contain any information that is useful to study authoring tools or administration tools that is not part of the Bridge data model. 
 * @param irbName The name of the IRB that approved the study or decided it was exempt from human subjects research guidelines. Optional, but can be used to identify one of several IRBs if more than one is included in the study’s contact information.
 * @param irbDecisionOn Before the study can launch, it must be reviewed by your IRB and either be approved, or considered exempt from human subjects research guidelines.
 * @param irbExpiresOn The last date that the IRB’s review is considered up-to-date for this study.
 * @param irbDecisionType 
 * @param irbProtocolName The name of the protocol as it was submitted to the IRB for approval.
 * @param irbProtocolId An identification number for the study that has been assigned by the IRB.
 * @param studyLogoUrl An URL to a logo for the study.
 * @param colorScheme 
 * @param institutionId An identification number for the study that has been assigned by the sponsor or institution running the study.
 * @param scheduleGuid The GUID of the schedule to use for this study. **NOTE: this is temporary, and will be replaced with a model of the study protocol that can include multiple arms in the study.** 
 * @param keywords Free text that can be used in searches to locate studies.
 * @param diseases A list of the diseases that are the subject of this study.
 * @param studyDesignTypes The type of study (e.g. observational, interventional, etc.).
 * @param signInTypes 
 * @param contacts 
 * @param deleted Has this study been logically deleted (an admin can restore it)? 
 * @param createdOn The date and time the study was created.
 * @param modifiedOn The date and time the study was last modified.
 * @param version The optimistic locking version of the study. This value must be submitted as part of the next update of the model. If it does not match the value on the server, a 409 error (Conflict) will prevent the update from occurring. It can also serve as a key to determine if a local cache of this `Study` revision needs to be updated. 
 * @param type Study
 */
@Serializable
data class Study (
    /* The identifier for this study. */
    @SerialName("identifier")
    val identifier: String,
    /* The name of the study. */
    @SerialName("name")
    val name: String,
    @SerialName("phase")
    val phase: StudyPhase,
    /* The optimistic locking version of the study. This value must be submitted as part of the next update of the model. If it does not match the value on the server, a 409 error (Conflict) will prevent the update from occurring. It can also serve as a key to determine if a local cache of this `Study` revision needs to be updated.  */
    @SerialName("version")
    val version: Long,
    /* An in-depth description of this study for prospective participants, or to show participants after they have joined a study (the “about” screen for the study). */
    @SerialName("details")
    val details: String? = null,
    /* Client data for a study should be in a syntactically valid JSON format. It will be returned as is to the client (as JSON). It can contain any information that is useful to study authoring tools or administration tools that is not part of the Bridge data model.  */
    @SerialName("clientData")
    val clientData: JsonElement? = null,
    /* The name of the IRB that approved the study or decided it was exempt from human subjects research guidelines. Optional, but can be used to identify one of several IRBs if more than one is included in the study’s contact information. */
    @SerialName("irbName")
    val irbName: String? = null,
    /* Before the study can launch, it must be reviewed by your IRB and either be approved, or considered exempt from human subjects research guidelines. */
    @SerialName("irbDecisionOn")
    val irbDecisionOn: String? = null,
    /* The last date that the IRB’s review is considered up-to-date for this study. */
    @SerialName("irbExpiresOn")
    val irbExpiresOn: String? = null,
    @SerialName("irbDecisionType")
    val irbDecisionType: IrbDecisionType? = null,
    /* The name of the protocol as it was submitted to the IRB for approval. */
    @SerialName("irbProtocolName")
    val irbProtocolName: String? = null,
    /* An identification number for the study that has been assigned by the IRB. */
    @SerialName("irbProtocolId")
    val irbProtocolId: String? = null,
    /* An URL to a logo for the study. */
    @SerialName("studyLogoUrl")
    val studyLogoUrl: String? = null,
    @SerialName("colorScheme")
    val colorScheme: ColorScheme? = null,
    /* An identification number for the study that has been assigned by the sponsor or institution running the study. */
    @SerialName("institutionId")
    val institutionId: String? = null,
    /* The GUID of the schedule to use for this study. **NOTE: this is temporary, and will be replaced with a model of the study protocol that can include multiple arms in the study.**  */
    @SerialName("scheduleGuid")
    val scheduleGuid: String? = null,
    /* Free text that can be used in searches to locate studies. */
    @SerialName("keywords")
    val keywords: String? = null,
    /* A list of the diseases that are the subject of this study. */
    @SerialName("diseases")
    val diseases: List<String>? = null,
    /* The type of study (e.g. observational, interventional, etc.). */
    @SerialName("studyDesignTypes")
    val studyDesignTypes: List<String>? = null,
    @SerialName("signInTypes")
    val signInTypes: List<SignInType>? = null,
    @SerialName("contacts")
    val contacts: List<Contact>? = null,
    /* Has this study been logically deleted (an admin can restore it)?  */
    @SerialName("deleted")
    val deleted: Boolean? = null,
    /* The date and time the study was created. */
    @SerialName("createdOn")
    val createdOn: String? = null,
    /* The date and time the study was last modified. */
    @SerialName("modifiedOn")
    val modifiedOn: String? = null,
    /* Study */
    @SerialName("type")
    val type: String? = null
)

