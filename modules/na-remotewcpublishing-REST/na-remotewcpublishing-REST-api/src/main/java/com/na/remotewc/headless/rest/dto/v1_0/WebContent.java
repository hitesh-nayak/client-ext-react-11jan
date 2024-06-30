package com.na.remotewc.headless.rest.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.util.ObjectMapperUtil;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author untodawn035
 * @generated
 */
@Generated("")
@GraphQLName(
	description = "Retrieves a journal article from the database based on a parameter.",
	value = "WebContent"
)
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "WebContent")
public class WebContent implements Serializable {

	public static WebContent toDTO(String json) {
		return ObjectMapperUtil.readValue(WebContent.class, json);
	}

	public static WebContent unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(WebContent.class, json);
	}

	@Schema(
		description = "The primary key of the wc article(may be same for diff ver.)."
	)
	public String getArticleIdwc() {
		return articleIdwc;
	}

	public void setArticleIdwc(String articleIdwc) {
		this.articleIdwc = articleIdwc;
	}

	@JsonIgnore
	public void setArticleIdwc(
		UnsafeSupplier<String, Exception> articleIdwcUnsafeSupplier) {

		try {
			articleIdwc = articleIdwcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(
		description = "The primary key of the wc article(may be same for diff ver.)."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String articleIdwc;

	@Schema(description = "PK of DDMStr class IF wc is asscociated.")
	public Long getClassNameIdwc() {
		return classNameIdwc;
	}

	public void setClassNameIdwc(Long classNameIdwc) {
		this.classNameIdwc = classNameIdwc;
	}

	@JsonIgnore
	public void setClassNameIdwc(
		UnsafeSupplier<Long, Exception> classNameIdwcUnsafeSupplier) {

		try {
			classNameIdwc = classNameIdwcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "PK of DDMStr class IF wc is asscociated.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long classNameIdwc;

	@Schema(description = "PK of DDMStr IF wc is asscociated.")
	public Long getClassPKwc() {
		return classPKwc;
	}

	public void setClassPKwc(Long classPKwc) {
		this.classPKwc = classPKwc;
	}

	@JsonIgnore
	public void setClassPKwc(
		UnsafeSupplier<Long, Exception> classPKwcUnsafeSupplier) {

		try {
			classPKwc = classPKwcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "PK of DDMStr IF wc is asscociated.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long classPKwc;

	@Schema(description = "HTML content wrapped in XML.")
	public String getContentPrimarywc() {
		return contentPrimarywc;
	}

	public void setContentPrimarywc(String contentPrimarywc) {
		this.contentPrimarywc = contentPrimarywc;
	}

	@JsonIgnore
	public void setContentPrimarywc(
		UnsafeSupplier<String, Exception> contentPrimarywcUnsafeSupplier) {

		try {
			contentPrimarywc = contentPrimarywcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "HTML content wrapped in XML.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String contentPrimarywc;

	@Schema(description = "HTML content wrapped in XML.")
	public String getContentSecondarywc() {
		return contentSecondarywc;
	}

	public void setContentSecondarywc(String contentSecondarywc) {
		this.contentSecondarywc = contentSecondarywc;
	}

	@JsonIgnore
	public void setContentSecondarywc(
		UnsafeSupplier<String, Exception> contentSecondarywcUnsafeSupplier) {

		try {
			contentSecondarywc = contentSecondarywcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "HTML content wrapped in XML.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String contentSecondarywc;

	@Schema(description = "ID of the PK of DDMStr if the wc is assoc. or '0'")
	public Long getDdmStructureIDwc() {
		return ddmStructureIDwc;
	}

	public void setDdmStructureIDwc(Long ddmStructureIDwc) {
		this.ddmStructureIDwc = ddmStructureIDwc;
	}

	@JsonIgnore
	public void setDdmStructureIDwc(
		UnsafeSupplier<Long, Exception> ddmStructureIDwcUnsafeSupplier) {

		try {
			ddmStructureIDwc = ddmStructureIDwcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(
		description = "ID of the PK of DDMStr if the wc is assoc. or '0'"
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long ddmStructureIDwc;

	@Schema(description = "Key of the DDMStruc of the wc")
	public String getDdmStructureKeywc() {
		return ddmStructureKeywc;
	}

	public void setDdmStructureKeywc(String ddmStructureKeywc) {
		this.ddmStructureKeywc = ddmStructureKeywc;
	}

	@JsonIgnore
	public void setDdmStructureKeywc(
		UnsafeSupplier<String, Exception> ddmStructureKeywcUnsafeSupplier) {

		try {
			ddmStructureKeywc = ddmStructureKeywcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "Key of the DDMStruc of the wc")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String ddmStructureKeywc;

	@Schema(description = "PK of the wc's DDMTemp.")
	public String getDdmTemplateKeywc() {
		return ddmTemplateKeywc;
	}

	public void setDdmTemplateKeywc(String ddmTemplateKeywc) {
		this.ddmTemplateKeywc = ddmTemplateKeywc;
	}

	@JsonIgnore
	public void setDdmTemplateKeywc(
		UnsafeSupplier<String, Exception> ddmTemplateKeywcUnsafeSupplier) {

		try {
			ddmTemplateKeywc = ddmTemplateKeywcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "PK of the wc's DDMTemp.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String ddmTemplateKeywc;

	@Schema(description = "Default Lang of the wc.")
	public String getDefLang() {
		return defLang;
	}

	public void setDefLang(String defLang) {
		this.defLang = defLang;
	}

	@JsonIgnore
	public void setDefLang(
		UnsafeSupplier<String, Exception> defLangUnsafeSupplier) {

		try {
			defLang = defLangUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "Default Lang of the wc.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String defLang;

	@Schema(description = "Desc of wc in default language.")
	public String getDescLangPrimarywc() {
		return descLangPrimarywc;
	}

	public void setDescLangPrimarywc(String descLangPrimarywc) {
		this.descLangPrimarywc = descLangPrimarywc;
	}

	@JsonIgnore
	public void setDescLangPrimarywc(
		UnsafeSupplier<String, Exception> descLangPrimarywcUnsafeSupplier) {

		try {
			descLangPrimarywc = descLangPrimarywcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "Desc of wc in default language.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String descLangPrimarywc;

	@Schema(description = "Desc of wc in secondary language.")
	public String getDescLangSecondarywc() {
		return descLangSecondarywc;
	}

	public void setDescLangSecondarywc(String descLangSecondarywc) {
		this.descLangSecondarywc = descLangSecondarywc;
	}

	@JsonIgnore
	public void setDescLangSecondarywc(
		UnsafeSupplier<String, Exception> descLangSecondarywcUnsafeSupplier) {

		try {
			descLangSecondarywc = descLangSecondarywcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "Desc of wc in secondary language.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String descLangSecondarywc;

	@Schema(description = "Date the wc is set to display.")
	public Date getDispDatewc() {
		return dispDatewc;
	}

	public void setDispDatewc(Date dispDatewc) {
		this.dispDatewc = dispDatewc;
	}

	@JsonIgnore
	public void setDispDatewc(
		UnsafeSupplier<Date, Exception> dispDatewcUnsafeSupplier) {

		try {
			dispDatewc = dispDatewcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "Date the wc is set to display.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Date dispDatewc;

	@Schema(description = "The ext ref code.")
	public String getExtReferenceCode() {
		return extReferenceCode;
	}

	public void setExtReferenceCode(String extReferenceCode) {
		this.extReferenceCode = extReferenceCode;
	}

	@JsonIgnore
	public void setExtReferenceCode(
		UnsafeSupplier<String, Exception> extReferenceCodeUnsafeSupplier) {

		try {
			extReferenceCode = extReferenceCodeUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The ext ref code.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String extReferenceCode;

	@Schema(description = "Desc of wc in default language.")
	public String getFUrlLangPrimarywc() {
		return fUrlLangPrimarywc;
	}

	public void setFUrlLangPrimarywc(String fUrlLangPrimarywc) {
		this.fUrlLangPrimarywc = fUrlLangPrimarywc;
	}

	@JsonIgnore
	public void setFUrlLangPrimarywc(
		UnsafeSupplier<String, Exception> fUrlLangPrimarywcUnsafeSupplier) {

		try {
			fUrlLangPrimarywc = fUrlLangPrimarywcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "Desc of wc in default language.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String fUrlLangPrimarywc;

	@Schema(description = "Desc of wc in secondary language.")
	public String getFUrlLangSecondarywc() {
		return fUrlLangSecondarywc;
	}

	public void setFUrlLangSecondarywc(String fUrlLangSecondarywc) {
		this.fUrlLangSecondarywc = fUrlLangSecondarywc;
	}

	@JsonIgnore
	public void setFUrlLangSecondarywc(
		UnsafeSupplier<String, Exception> fUrlLangSecondarywcUnsafeSupplier) {

		try {
			fUrlLangSecondarywc = fUrlLangSecondarywcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "Desc of wc in secondary language.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String fUrlLangSecondarywc;

	@Schema(description = "cnid of the content the files are assoc. with.")
	public Long getFileClassNameId() {
		return fileClassNameId;
	}

	public void setFileClassNameId(Long fileClassNameId) {
		this.fileClassNameId = fileClassNameId;
	}

	@JsonIgnore
	public void setFileClassNameId(
		UnsafeSupplier<Long, Exception> fileClassNameIdUnsafeSupplier) {

		try {
			fileClassNameId = fileClassNameIdUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(
		description = "cnid of the content the files are assoc. with."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long fileClassNameId;

	@Schema(
		description = "resprimkey of the web-content the files are assoc. with."
	)
	public Long getFileClassNamePk() {
		return fileClassNamePk;
	}

	public void setFileClassNamePk(Long fileClassNamePk) {
		this.fileClassNamePk = fileClassNamePk;
	}

	@JsonIgnore
	public void setFileClassNamePk(
		UnsafeSupplier<Long, Exception> fileClassNamePkUnsafeSupplier) {

		try {
			fileClassNamePk = fileClassNamePkUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(
		description = "resprimkey of the web-content the files are assoc. with."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long fileClassNamePk;

	@Schema(description = "file descs.")
	public String[] getFileDescs() {
		return fileDescs;
	}

	public void setFileDescs(String[] fileDescs) {
		this.fileDescs = fileDescs;
	}

	@JsonIgnore
	public void setFileDescs(
		UnsafeSupplier<String[], Exception> fileDescsUnsafeSupplier) {

		try {
			fileDescs = fileDescsUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "file descs.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String[] fileDescs;

	@Schema(description = "Ids of associated files.")
	public Long[] getFileEntryIds() {
		return fileEntryIds;
	}

	public void setFileEntryIds(Long[] fileEntryIds) {
		this.fileEntryIds = fileEntryIds;
	}

	@JsonIgnore
	public void setFileEntryIds(
		UnsafeSupplier<Long[], Exception> fileEntryIdsUnsafeSupplier) {

		try {
			fileEntryIds = fileEntryIdsUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "Ids of associated files.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long[] fileEntryIds;

	@Schema(description = "fileEntry uuids.")
	public String[] getFileEntryUuids() {
		return fileEntryUuids;
	}

	public void setFileEntryUuids(String[] fileEntryUuids) {
		this.fileEntryUuids = fileEntryUuids;
	}

	@JsonIgnore
	public void setFileEntryUuids(
		UnsafeSupplier<String[], Exception> fileEntryUuidsUnsafeSupplier) {

		try {
			fileEntryUuids = fileEntryUuidsUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "fileEntry uuids.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String[] fileEntryUuids;

	@Schema(description = "file mime types.")
	public String[] getFileMimes() {
		return fileMimes;
	}

	public void setFileMimes(String[] fileMimes) {
		this.fileMimes = fileMimes;
	}

	@JsonIgnore
	public void setFileMimes(
		UnsafeSupplier<String[], Exception> fileMimesUnsafeSupplier) {

		try {
			fileMimes = fileMimesUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "file mime types.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String[] fileMimes;

	@Schema(description = "file names.")
	public String[] getFileNames() {
		return fileNames;
	}

	public void setFileNames(String[] fileNames) {
		this.fileNames = fileNames;
	}

	@JsonIgnore
	public void setFileNames(
		UnsafeSupplier<String[], Exception> fileNamesUnsafeSupplier) {

		try {
			fileNames = fileNamesUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "file names.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String[] fileNames;

	@Schema(description = "file titles.")
	public String[] getFileTitles() {
		return fileTitles;
	}

	public void setFileTitles(String[] fileTitles) {
		this.fileTitles = fileTitles;
	}

	@JsonIgnore
	public void setFileTitles(
		UnsafeSupplier<String[], Exception> fileTitlesUnsafeSupplier) {

		try {
			fileTitles = fileTitlesUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "file titles.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String[] fileTitles;

	@Schema(description = "PK of wc article folder.")
	public Long getFolderIdwc() {
		return folderIdwc;
	}

	public void setFolderIdwc(Long folderIdwc) {
		this.folderIdwc = folderIdwc;
	}

	@JsonIgnore
	public void setFolderIdwc(
		UnsafeSupplier<Long, Exception> folderIdwcUnsafeSupplier) {

		try {
			folderIdwc = folderIdwcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "PK of wc article folder.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long folderIdwc;

	@Schema(description = "aka site ID.")
	public Long getGroupIdwc() {
		return groupIdwc;
	}

	public void setGroupIdwc(Long groupIdwc) {
		this.groupIdwc = groupIdwc;
	}

	@JsonIgnore
	public void setGroupIdwc(
		UnsafeSupplier<Long, Exception> groupIdwcUnsafeSupplier) {

		try {
			groupIdwc = groupIdwcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "aka site ID.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long groupIdwc;

	@Schema(
		description = "Unique id of the journal article. PK of JournalArticle table."
	)
	public Long getIdPK() {
		return idPK;
	}

	public void setIdPK(Long idPK) {
		this.idPK = idPK;
	}

	@JsonIgnore
	public void setIdPK(UnsafeSupplier<Long, Exception> idPKUnsafeSupplier) {
		try {
			idPK = idPKUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(
		description = "Unique id of the journal article. PK of JournalArticle table."
	)
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long idPK;

	@Schema(description = "Images in Base64.")
	public String[] getImagesB64Encoded() {
		return imagesB64Encoded;
	}

	public void setImagesB64Encoded(String[] imagesB64Encoded) {
		this.imagesB64Encoded = imagesB64Encoded;
	}

	@JsonIgnore
	public void setImagesB64Encoded(
		UnsafeSupplier<String[], Exception> imagesB64EncodedUnsafeSupplier) {

		try {
			imagesB64Encoded = imagesB64EncodedUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "Images in Base64.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String[] imagesB64Encoded;

	@Schema(description = "Is the wc searchable.")
	public Boolean getIndexablewc() {
		return indexablewc;
	}

	public void setIndexablewc(Boolean indexablewc) {
		this.indexablewc = indexablewc;
	}

	@JsonIgnore
	public void setIndexablewc(
		UnsafeSupplier<Boolean, Exception> indexablewcUnsafeSupplier) {

		try {
			indexablewc = indexablewcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "Is the wc searchable.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean indexablewc;

	@Schema(description = "Unique string of the wc's disp page.")
	public String getLayoutUuidwc() {
		return layoutUuidwc;
	}

	public void setLayoutUuidwc(String layoutUuidwc) {
		this.layoutUuidwc = layoutUuidwc;
	}

	@JsonIgnore
	public void setLayoutUuidwc(
		UnsafeSupplier<String, Exception> layoutUuidwcUnsafeSupplier) {

		try {
			layoutUuidwc = layoutUuidwcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "Unique string of the wc's disp page.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String layoutUuidwc;

	@Schema(description = "Default locale of the wc.")
	public String getLocalePrimarywc() {
		return localePrimarywc;
	}

	public void setLocalePrimarywc(String localePrimarywc) {
		this.localePrimarywc = localePrimarywc;
	}

	@JsonIgnore
	public void setLocalePrimarywc(
		UnsafeSupplier<String, Exception> localePrimarywcUnsafeSupplier) {

		try {
			localePrimarywc = localePrimarywcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "Default locale of the wc.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String localePrimarywc;

	@Schema(description = "Secondary locale of the wc.")
	public String getLocaleSecondarywc() {
		return localeSecondarywc;
	}

	public void setLocaleSecondarywc(String localeSecondarywc) {
		this.localeSecondarywc = localeSecondarywc;
	}

	@JsonIgnore
	public void setLocaleSecondarywc(
		UnsafeSupplier<String, Exception> localeSecondarywcUnsafeSupplier) {

		try {
			localeSecondarywc = localeSecondarywcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "Secondary locale of the wc.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String localeSecondarywc;

	@Schema(description = "Date the wc was last modified.")
	public Date getModDatewc() {
		return modDatewc;
	}

	public void setModDatewc(Date modDatewc) {
		this.modDatewc = modDatewc;
	}

	@JsonIgnore
	public void setModDatewc(
		UnsafeSupplier<Date, Exception> modDatewcUnsafeSupplier) {

		try {
			modDatewc = modDatewcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "Date the wc was last modified.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Date modDatewc;

	@Schema(description = "Is the wc set to never review.")
	public Boolean getNeverReviewwc() {
		return neverReviewwc;
	}

	public void setNeverReviewwc(Boolean neverReviewwc) {
		this.neverReviewwc = neverReviewwc;
	}

	@JsonIgnore
	public void setNeverReviewwc(
		UnsafeSupplier<Boolean, Exception> neverReviewwcUnsafeSupplier) {

		try {
			neverReviewwc = neverReviewwcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "Is the wc set to never review.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean neverReviewwc;

	@Schema(description = "Does the wc have a small image.")
	public Boolean getSmallImagewc() {
		return smallImagewc;
	}

	public void setSmallImagewc(Boolean smallImagewc) {
		this.smallImagewc = smallImagewc;
	}

	@JsonIgnore
	public void setSmallImagewc(
		UnsafeSupplier<Boolean, Exception> smallImagewcUnsafeSupplier) {

		try {
			smallImagewc = smallImagewcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "Does the wc have a small image.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean smallImagewc;

	@Schema(description = "Title of wc in default language.")
	public String getTitleLangPrimarywc() {
		return titleLangPrimarywc;
	}

	public void setTitleLangPrimarywc(String titleLangPrimarywc) {
		this.titleLangPrimarywc = titleLangPrimarywc;
	}

	@JsonIgnore
	public void setTitleLangPrimarywc(
		UnsafeSupplier<String, Exception> titleLangPrimarywcUnsafeSupplier) {

		try {
			titleLangPrimarywc = titleLangPrimarywcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "Title of wc in default language.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String titleLangPrimarywc;

	@Schema(description = "Title of wc in secondary language.")
	public String getTitleLangSecondarywc() {
		return titleLangSecondarywc;
	}

	public void setTitleLangSecondarywc(String titleLangSecondarywc) {
		this.titleLangSecondarywc = titleLangSecondarywc;
	}

	@JsonIgnore
	public void setTitleLangSecondarywc(
		UnsafeSupplier<String, Exception> titleLangSecondarywcUnsafeSupplier) {

		try {
			titleLangSecondarywc = titleLangSecondarywcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "Title of wc in secondary language.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String titleLangSecondarywc;

	@Schema(description = "PK of the wc owner.")
	public Long getUserIdwc() {
		return userIdwc;
	}

	public void setUserIdwc(Long userIdwc) {
		this.userIdwc = userIdwc;
	}

	@JsonIgnore
	public void setUserIdwc(
		UnsafeSupplier<Long, Exception> userIdwcUnsafeSupplier) {

		try {
			userIdwc = userIdwcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "PK of the wc owner.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long userIdwc;

	@Schema(description = "The unique uuId string of the wc.")
	public String getUuIdwc() {
		return uuIdwc;
	}

	public void setUuIdwc(String uuIdwc) {
		this.uuIdwc = uuIdwc;
	}

	@JsonIgnore
	public void setUuIdwc(
		UnsafeSupplier<String, Exception> uuIdwcUnsafeSupplier) {

		try {
			uuIdwc = uuIdwcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "The unique uuId string of the wc.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String uuIdwc;

	@Schema(description = "Version of the wc.")
	public Double getVersionwc() {
		return versionwc;
	}

	public void setVersionwc(Double versionwc) {
		this.versionwc = versionwc;
	}

	@JsonIgnore
	public void setVersionwc(
		UnsafeSupplier<Double, Exception> versionwcUnsafeSupplier) {

		try {
			versionwc = versionwcUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField(description = "Version of the wc.")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Double versionwc;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof WebContent)) {
			return false;
		}

		WebContent webContent = (WebContent)object;

		return Objects.equals(toString(), webContent.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");

		if (articleIdwc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"articleIdwc\": ");

			sb.append("\"");

			sb.append(_escape(articleIdwc));

			sb.append("\"");
		}

		if (classNameIdwc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"classNameIdwc\": ");

			sb.append(classNameIdwc);
		}

		if (classPKwc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"classPKwc\": ");

			sb.append(classPKwc);
		}

		if (contentPrimarywc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"contentPrimarywc\": ");

			sb.append("\"");

			sb.append(_escape(contentPrimarywc));

			sb.append("\"");
		}

		if (contentSecondarywc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"contentSecondarywc\": ");

			sb.append("\"");

			sb.append(_escape(contentSecondarywc));

			sb.append("\"");
		}

		if (ddmStructureIDwc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"ddmStructureIDwc\": ");

			sb.append(ddmStructureIDwc);
		}

		if (ddmStructureKeywc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"ddmStructureKeywc\": ");

			sb.append("\"");

			sb.append(_escape(ddmStructureKeywc));

			sb.append("\"");
		}

		if (ddmTemplateKeywc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"ddmTemplateKeywc\": ");

			sb.append("\"");

			sb.append(_escape(ddmTemplateKeywc));

			sb.append("\"");
		}

		if (defLang != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"defLang\": ");

			sb.append("\"");

			sb.append(_escape(defLang));

			sb.append("\"");
		}

		if (descLangPrimarywc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"descLangPrimarywc\": ");

			sb.append("\"");

			sb.append(_escape(descLangPrimarywc));

			sb.append("\"");
		}

		if (descLangSecondarywc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"descLangSecondarywc\": ");

			sb.append("\"");

			sb.append(_escape(descLangSecondarywc));

			sb.append("\"");
		}

		if (dispDatewc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dispDatewc\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(dispDatewc));

			sb.append("\"");
		}

		if (extReferenceCode != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"extReferenceCode\": ");

			sb.append("\"");

			sb.append(_escape(extReferenceCode));

			sb.append("\"");
		}

		if (fUrlLangPrimarywc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fUrlLangPrimarywc\": ");

			sb.append("\"");

			sb.append(_escape(fUrlLangPrimarywc));

			sb.append("\"");
		}

		if (fUrlLangSecondarywc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fUrlLangSecondarywc\": ");

			sb.append("\"");

			sb.append(_escape(fUrlLangSecondarywc));

			sb.append("\"");
		}

		if (fileClassNameId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fileClassNameId\": ");

			sb.append(fileClassNameId);
		}

		if (fileClassNamePk != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fileClassNamePk\": ");

			sb.append(fileClassNamePk);
		}

		if (fileDescs != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fileDescs\": ");

			sb.append("[");

			for (int i = 0; i < fileDescs.length; i++) {
				sb.append("\"");

				sb.append(_escape(fileDescs[i]));

				sb.append("\"");

				if ((i + 1) < fileDescs.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (fileEntryIds != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fileEntryIds\": ");

			sb.append("[");

			for (int i = 0; i < fileEntryIds.length; i++) {
				sb.append(fileEntryIds[i]);

				if ((i + 1) < fileEntryIds.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (fileEntryUuids != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fileEntryUuids\": ");

			sb.append("[");

			for (int i = 0; i < fileEntryUuids.length; i++) {
				sb.append("\"");

				sb.append(_escape(fileEntryUuids[i]));

				sb.append("\"");

				if ((i + 1) < fileEntryUuids.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (fileMimes != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fileMimes\": ");

			sb.append("[");

			for (int i = 0; i < fileMimes.length; i++) {
				sb.append("\"");

				sb.append(_escape(fileMimes[i]));

				sb.append("\"");

				if ((i + 1) < fileMimes.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (fileNames != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fileNames\": ");

			sb.append("[");

			for (int i = 0; i < fileNames.length; i++) {
				sb.append("\"");

				sb.append(_escape(fileNames[i]));

				sb.append("\"");

				if ((i + 1) < fileNames.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (fileTitles != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fileTitles\": ");

			sb.append("[");

			for (int i = 0; i < fileTitles.length; i++) {
				sb.append("\"");

				sb.append(_escape(fileTitles[i]));

				sb.append("\"");

				if ((i + 1) < fileTitles.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (folderIdwc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"folderIdwc\": ");

			sb.append(folderIdwc);
		}

		if (groupIdwc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"groupIdwc\": ");

			sb.append(groupIdwc);
		}

		if (idPK != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"idPK\": ");

			sb.append(idPK);
		}

		if (imagesB64Encoded != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"imagesB64Encoded\": ");

			sb.append("[");

			for (int i = 0; i < imagesB64Encoded.length; i++) {
				sb.append("\"");

				sb.append(_escape(imagesB64Encoded[i]));

				sb.append("\"");

				if ((i + 1) < imagesB64Encoded.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (indexablewc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"indexablewc\": ");

			sb.append(indexablewc);
		}

		if (layoutUuidwc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"layoutUuidwc\": ");

			sb.append("\"");

			sb.append(_escape(layoutUuidwc));

			sb.append("\"");
		}

		if (localePrimarywc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"localePrimarywc\": ");

			sb.append("\"");

			sb.append(_escape(localePrimarywc));

			sb.append("\"");
		}

		if (localeSecondarywc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"localeSecondarywc\": ");

			sb.append("\"");

			sb.append(_escape(localeSecondarywc));

			sb.append("\"");
		}

		if (modDatewc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"modDatewc\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(modDatewc));

			sb.append("\"");
		}

		if (neverReviewwc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"neverReviewwc\": ");

			sb.append(neverReviewwc);
		}

		if (smallImagewc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"smallImagewc\": ");

			sb.append(smallImagewc);
		}

		if (titleLangPrimarywc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"titleLangPrimarywc\": ");

			sb.append("\"");

			sb.append(_escape(titleLangPrimarywc));

			sb.append("\"");
		}

		if (titleLangSecondarywc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"titleLangSecondarywc\": ");

			sb.append("\"");

			sb.append(_escape(titleLangSecondarywc));

			sb.append("\"");
		}

		if (userIdwc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"userIdwc\": ");

			sb.append(userIdwc);
		}

		if (uuIdwc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"uuIdwc\": ");

			sb.append("\"");

			sb.append(_escape(uuIdwc));

			sb.append("\"");
		}

		if (versionwc != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"versionwc\": ");

			sb.append(versionwc);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "com.na.remotewc.headless.rest.dto.v1_0.WebContent",
		name = "x-class-name"
	)
	public String xClassName;

	private static String _escape(Object object) {
		return StringUtil.replace(
			String.valueOf(object), _JSON_ESCAPE_STRINGS[0],
			_JSON_ESCAPE_STRINGS[1]);
	}

	private static boolean _isArray(Object value) {
		if (value == null) {
			return false;
		}

		Class<?> clazz = value.getClass();

		return clazz.isArray();
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(_escape(entry.getKey()));
			sb.append("\": ");

			Object value = entry.getValue();

			if (_isArray(value)) {
				sb.append("[");

				Object[] valueArray = (Object[])value;

				for (int i = 0; i < valueArray.length; i++) {
					if (valueArray[i] instanceof String) {
						sb.append("\"");
						sb.append(valueArray[i]);
						sb.append("\"");
					}
					else {
						sb.append(valueArray[i]);
					}

					if ((i + 1) < valueArray.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof Map) {
				sb.append(_toJSON((Map<String, ?>)value));
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(value));
				sb.append("\"");
			}
			else {
				sb.append(value);
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

	private static final String[][] _JSON_ESCAPE_STRINGS = {
		{"\\", "\"", "\b", "\f", "\n", "\r", "\t"},
		{"\\\\", "\\\"", "\\b", "\\f", "\\n", "\\r", "\\t"}
	};

	private Map<String, Serializable> _extendedProperties;

}