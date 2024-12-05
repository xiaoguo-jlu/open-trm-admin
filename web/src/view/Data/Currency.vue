<template>
    <div id="app">
        <h1>Currency</h1>
        <el-form :inline="true" :model="queryParam" class="demo-form-inline">
            <el-form-item label="Currency Code">
                <el-input v-model="queryParam.currencyCode" placeholder="CNY" clearable/>
            </el-form-item>
            <el-form-item label="Currency Name">
                <el-input v-model="queryParam.currencyName" clearable/>
            </el-form-item>
            <el-form-item>
            </el-form-item>
        </el-form>
        <el-button type="primary" @click="query">Search</el-button>
        <el-button>Reset</el-button>
        <el-table :data="tableData">
            <el-table-column prop="currencyCode" label="Currency Code" />
            <el-table-column prop="currencyName" label="Currency Name" />
        </el-table>
    </div>
</template>

<script>
    export default {
        name: "CurrencyView",
        data() {
            return {
                "queryParam": {
                    currencyCode: "",
                    currencyName:"",
                },
                "tableData": [
                    {
                        currencyCode: "CNY",
                        currencyName:"Chinese Yuan",
                    },
                    {
                        currencyCode: "CNY",
                        currencyName:"Chinese Yuan",
                    },
                    {
                        currencyCode: "CNY",
                        currencyName:"Chinese Yuan",
                    },
                    {
                        currencyCode: "CNY",
                        currencyName:"Chinese Yuan",
                    },
                ],
            }
        },
        methods: {
            query: {

            }
        },
    }
</script>

<style scoped>

</style>