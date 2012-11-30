package org.mifosplatform.portfolio.charge.service;

import static org.mifosplatform.portfolio.charge.service.ChargeEnumerations.chargeAppliesTo;
import static org.mifosplatform.portfolio.charge.service.ChargeEnumerations.chargeCalculationType;
import static org.mifosplatform.portfolio.charge.service.ChargeEnumerations.chargeTimeType;

import java.util.Arrays;
import java.util.List;

import org.mifosng.platform.api.data.EnumOptionData;
import org.mifosplatform.portfolio.charge.domain.ChargeAppliesTo;
import org.mifosplatform.portfolio.charge.domain.ChargeCalculationType;
import org.mifosplatform.portfolio.charge.domain.ChargeTimeType;
import org.springframework.stereotype.Service;

@Service
public class ChargeDropdownReadPlatformServiceImpl implements ChargeDropdownReadPlatformService {

    @Override
    public List<EnumOptionData> retrieveCalculationTypes() {

        return Arrays.asList(chargeCalculationType(ChargeCalculationType.FLAT),
                chargeCalculationType(ChargeCalculationType.PERCENT_OF_AMOUNT)
        // chargeCalculationType(ChargeCalculationType.PERCENT_OF_AMOUNT_AND_INTEREST),
        // chargeCalculationType(ChargeCalculationType.PERCENT_OF_INTEREST)
                );
    }

    @Override
    public List<EnumOptionData> retrieveApplicableToTypes() {
        return Arrays.asList(chargeAppliesTo(ChargeAppliesTo.LOAN));
    }

    @Override
    public List<EnumOptionData> retrieveCollectionTimeTypes() {
        return Arrays.asList(chargeTimeType(ChargeTimeType.DISBURSEMENT), chargeTimeType(ChargeTimeType.SPECIFIED_DUE_DATE));
    }
}