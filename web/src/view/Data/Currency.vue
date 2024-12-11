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
        <el-divider />
        <el-table :data="tableData" border>
            <el-table-column prop="currencyCode" label="Currency Code" />
            <el-table-column prop="currencyName" label="Currency Name" />
        </el-table>
    </div>
</template>

<script>
    import {getCurrencyList} from "../../api/api.staticdata";

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
            query() {
                let that = this;
                // const req = new Axios();
                // req.get("/open-trm/services/static-data/currency/getAll", {})
                //     .then(function(res) {
                //       console.log(res);
                //     });
                getCurrencyList({})
                    .then(function(data) {
                        console.log(data);
                        that.tableData = data;
                    });
            }
        },
    }
</script>

<style scoped>

</style>