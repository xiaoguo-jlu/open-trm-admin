<template>
    <div id="app"  class="common-layout">
    </div>
</template>

<script>
    import router from "../router";

    export default {
        name: 'homePage',
        props: {
            msg: String
        },
        data() {
            return {
                "menu": {
                    "Cash Management": {

                    },
                    "Deal": {

                    },
                    "Settlement": {

                    },
                    "Report": {

                    },
                    "Instrument": {

                    },
                    "Rule": {

                    },
                    "Data": [
                        {"name": "Currency", "path": "/currency"},
                        {"name": "Country", "path": "/country"},
                    ],
                    "Config": {

                    },
                    "User": {

                    },
                }
            }
        },
        methods: {
            chooseMenu(path) {
                router.push(path)
            }
        },
        computed: {},
    }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
    #logo {
        text-align: left;
    }

    #app {
        font-family: Avenir, Helvetica, Arial, sans-serif;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
        text-align: center;
        color: #2c3e50;
    }

    #header {
        margin-top: 0;
        border-top-width: 0;
        background-color: #67C23A;
    }

    #footer {
        background-color: #000000;
        color: white;
        text-align: center;
        alignment: center;
    }

</style>
