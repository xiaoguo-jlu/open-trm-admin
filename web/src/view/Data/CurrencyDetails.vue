<template>
    <div id="app">
        <div id="bar"></div>
        <div id="contentArea">
            <el-container>
                <el-header></el-header>
                <el-main>
                    <el-form :inline="true" :model="currencyDetails" label-position=top label-width="auto">
                        <el-form-item label="Currency Code">
                            <el-input v-model="currencyDetails.currencyCode" placeholder="CNY" clearable/>
                        </el-form-item>
                        <el-form-item label="Currency Name">
                            <el-input v-model="currencyDetails.currencyName" placeholder="Chinese Yuan" clearable/>
                        </el-form-item>
                        <el-form-item label="Currency Description">
                            <el-input v-model="currencyDetails.description" placeholder="Chinese Yuan" clearable/>
                        </el-form-item>
                        <el-divider/>
                        <el-form-item label="Round Type">
                            <el-select v-model="currencyDetails.roundType" placeholder="placeholder">
                                <el-option
                                        v-for="item in optionsList"
                                        :key="item.value"
                                        :label="item.label"
                                        :value="item.value">
                                </el-option>
                            </el-select>
                        </el-form-item>
                        <el-form-item label="Amount Precision">
                            <el-input v-model="currencyDetails.amountPrecision" placeholder="2" clearable/>
                        </el-form-item>
                        <el-form-item label="Rate Precision">
                            <el-input v-model="currencyDetails.ratePrecision" placeholder="12" clearable/>
                        </el-form-item>
                    </el-form>
                </el-main>
                <el-footer>
                    <el-button type="primary">Save</el-button>
                    <el-button type="primary">Delete</el-button>
                </el-footer>
            </el-container>
        </div>
        <div id="operateButtonGroup"></div>
    </div>
</template>

<script>
    export default {
        name: "CurrencyDetails",
        data() {
            return {
                currencyDetails: {},
                roundTypeList: [
                    {label: "4/5", value: ""},

                ],

            }
        }
    }
</script>

<style scoped>

</style>