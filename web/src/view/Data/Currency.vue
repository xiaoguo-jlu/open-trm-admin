<template>
    <div id="app">
        <el-breadcrumb separator="/">
            <el-breadcrumb-item :to="{ path: '/' }">Home</el-breadcrumb-item>
            <el-breadcrumb-item>
                <a href="/">Static Data</a>
            </el-breadcrumb-item>
            <el-breadcrumb-item>Data</el-breadcrumb-item>
            <el-breadcrumb-item :to="{path: '/static-data/currency'}">Currency</el-breadcrumb-item>
        </el-breadcrumb>
        <el-form :inline="true" :model="queryParam" class="demo-form-inline">
            <el-form-item label="Currency Code">
                <el-input v-model="queryParam.currencyCode" placeholder="CNY" clearable/>
            </el-form-item>
            <el-form-item label="Currency Name">
                <el-input v-model="queryParam.currencyName" clearable/>
            </el-form-item>
            <el-form-item label="Status">
                <el-input v-model="queryParam.status" clearable/>
            </el-form-item>
            <el-form-item>
            </el-form-item>
        </el-form>
        <el-button type="primary" @click="query">Search</el-button>
        <el-button>Reset</el-button>
        <el-divider/>
        <div id="operate-button-area">
            <el-row>
                <el-col :span="1">
                    <el-button type="primary" @click="openNew">New</el-button>
                </el-col>
                <el-col :span="1">
                    <el-button type="primary" @click="query">Delete</el-button>
                </el-col>
            </el-row>
            <el-divider />
        </div>
        <div id="content-area">
            <el-table :data="tableData" border>
                <el-table-column prop="currencyCode" label="Currency Code"/>
                <el-table-column prop="currencyName" label="Currency Name"/>
                <el-table-column prop="description" label="Description"/>
                <el-table-column prop="amountPrecision" label="Amount Precision"/>
                <el-table-column prop="ratePrecision" label="Rate Precision"/>
                <el-table-column prop="roundingMethod" label="Rounding Method"/>
                <el-table-column prop="holiday" label="Holiday"/>

            </el-table>
        </div>
        <div id="page-area">
            <el-pagination hide-on-single-page background layout="prev, pager, next, sizes, jumper, total"
                           :total="pageParam.total" :page-sizes="pageParam.allowPageSize" :size="pageParam.pageSize"
                           @current-change="handleCurrentChange" @size-change="handleSizeChange"></el-pagination>
        </div>
    </div>
</template>

<script>
    import {getPagedResult} from "../../api/api.staticdata";
    import router from "../../router";

    export default {
        name: "CurrencyView",
        data() {
            return {
                "pageParam" : {
                    "total": 100,//总条数
                    "pageSize":10,//指定展示多少条
                    "currentPage":1,//当前页码
                    "currentSize": 10,
                    "allowPageSize": [10, 20, 50, 100, 200, 500],
                },
                "queryParam": {
                    currencyCode: "",
                    currencyName: "",
                    stauts: "",
                },
                "tableData": [
                ],
            }
        },
        methods: {
            query() {
                let that = this;
                // const req = new Axios();
                // req.get("/finance/trm/services/staticdata/currency/findAll", {})
                //     .then(function(res) {
                //       console.log(res);
                //     });
                getPagedResult(this.queryParam, this.pageParam)
                    .then(function (data) {
                        console.log(data);
                        that.tableData = data.data;
                        that.pageParam.currentPage = data.pageInfo.currentPage;
                        that.pageParam.pageSize = data.pageInfo.pageSize;
                        that.pageParam.total = data.pageInfo.total;
                    });
            },
            openNew() {
                router.push("/static-data/currencyDetails");
            },
            handleCurrentChange(currentPage){
                console.log(currentPage);
                this.currentPage = currentPage;
            },
            handleSizeChange(currentSize){
                console.log(currentSize);
                this.currentSize = currentSize;
            },
        },
    }
</script>

<style scoped>
    .operate-button {
        alignment: left;
    }
</style>