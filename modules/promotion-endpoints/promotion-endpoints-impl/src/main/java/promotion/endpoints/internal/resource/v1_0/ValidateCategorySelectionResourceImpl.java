package promotion.endpoints.internal.resource.v1_0;

import com.liferay.asset.kernel.model.AssetCategory;
import com.liferay.asset.kernel.service.AssetCategoryLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.vulcan.multipart.MultipartBody;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

import promotion.endpoints.dto.v1_0.ValidateCategorySelectionResponse;
import promotion.endpoints.resource.v1_0.ValidateCategorySelectionResource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author me
 */
@Component(properties = "OSGI-INF/liferay/rest/v1_0/validate-category-selection.properties", scope = ServiceScope.PROTOTYPE, service = ValidateCategorySelectionResource.class)
public class ValidateCategorySelectionResourceImpl extends BaseValidateCategorySelectionResourceImpl {

    @Override
    public ValidateCategorySelectionResponse postValidatePromotionCategory(MultipartBody multipartBody) throws Exception {
        ValidateCategorySelectionResponse validateCategorySelectionResponse = new ValidateCategorySelectionResponse();
        boolean isValid = false;
        try {


            List<Long> categoryList = new ArrayList<>();


            Long rootCategory = multipartBody.getValueAsNullableInstance("rootCategory", Long.class);
            Long firstCategory = multipartBody.getValueAsNullableInstance("firstCategory", Long.class);
            Long secondCategory = multipartBody.getValueAsNullableInstance("secondCategory", Long.class);
            Long thirdCategory = multipartBody.getValueAsNullableInstance("thirdCategory", Long.class);
            Long fourthCategory = multipartBody.getValueAsNullableInstance("fourthCategory", Long.class);


            if (Validator.isNotNull(rootCategory)) categoryList.add(rootCategory);
            if (Validator.isNotNull(firstCategory)) categoryList.add(firstCategory);
            if (Validator.isNotNull(secondCategory)) categoryList.add(secondCategory);
            if (Validator.isNotNull(thirdCategory)) categoryList.add(thirdCategory);
            if (Validator.isNotNull(fourthCategory)) categoryList.add(fourthCategory);

            log.info(categoryList);

            for (int i = 0; i < categoryList.size() - 2; i++) {
                isValid = isValidCategory(categoryList.get(i), categoryList.get(i + 1));
                if (!isValid) break;
            }
            validateCategorySelectionResponse.setIsValid(isValid);
        } catch (IOException ignored) {
            validateCategorySelectionResponse.setIsValid(isValid);
        }


        return validateCategorySelectionResponse;
    }


    private static boolean isValidCategory(Long superId, Long subId) {
        try {
            AssetCategory assetCategory = AssetCategoryLocalServiceUtil.getAssetCategory(superId);
            if (Validator.isNotNull(assetCategory)) {
                Long[] subIdArr = AssetCategoryLocalServiceUtil.getChildCategories(superId).stream().map(AssetCategory::getCategoryId).toArray(Long[]::new);
                if (subIdArr.length > 0) return Arrays.asList(subIdArr).contains(subId);
                else return true;
            }


        } catch (PortalException e) {
            return false;
        }


        return false;
    }

    private static final Log log = LogFactoryUtil.getLog(ValidateCategorySelectionResourceImpl.class);
}