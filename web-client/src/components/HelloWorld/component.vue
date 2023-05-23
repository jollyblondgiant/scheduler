
<script>
import {controller} from './script.js'
export default {
    name: 'HelloWorld',
    data() {
        return controller(this._props);
    },
    props: {
      msg: String
    }
  }
</script>

<style src="./style.css"></style>
<template src="./template.html"></template>