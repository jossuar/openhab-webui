<template>
  <f7-card :no-border="config.noBorder" :no-shadow="config.noShadow" :outline="config.outline">
    <f7-card-header v-if="config.title">
      <div>{{ config.title }}</div>
    </f7-card-header>
    <f7-card-content class="display-flex justify-content-center">
      <oh-knob :context="childContext(context.component)" @command="onCommand" />
    </f7-card-content>
    <f7-card-footer v-if="config.footer">
      {{ config.footer }}
    </f7-card-footer>
  </f7-card>
</template>

<style lang="stylus">
</style>

<script>
import mixin from '../widget-mixin'
import OhKnob from '../system/oh-knob.vue'
import { OhKnobCardDefinition } from '@/assets/definitions/widgets/standard/cards'

export default {
  mixins: [mixin],
  components: {
    OhKnob
  },
  widget: OhKnobCardDefinition
}
</script>
