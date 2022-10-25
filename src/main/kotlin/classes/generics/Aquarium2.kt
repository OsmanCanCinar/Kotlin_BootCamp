package classes.generics

fun main() { genericEx() }

open class WaterSupply(var needsProcessed: Boolean)

class TapWater : WaterSupply(true) { fun addChemicalCleaners() = apply { needsProcessed = false } }

class LakeWater : WaterSupply(true) { fun filter() = apply { needsProcessed = false } }

class FishStoreWater : WaterSupply(false)

// Out types can be uses as return values
class Aquarium<out T : WaterSupply>(val waterSupply: T) { fun addWater(cleaner: Cleaner<T>) {
        if (!waterSupply.needsProcessed) { cleaner.clean(waterSupply) }
        println("adding water from $waterSupply") } }

// In types can be used as parameters
interface Cleaner<in T : WaterSupply> { fun clean(waterSupply: T) }

class TapWaterCleaner : Cleaner<TapWater> { override fun clean(waterSupply: TapWater) { waterSupply.addChemicalCleaners() } }

class LakeWaterCleaner : Cleaner<LakeWater> { override fun clean(waterSupply: LakeWater) { waterSupply.filter() } }

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

fun <T : WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
    if (aquarium.waterSupply.needsProcessed) { println("yes, its clean") } else { println("no, its not clean") } }

inline fun <reified R : WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R

inline fun <reified T : WaterSupply> WaterSupply.isOfType() = this is T

fun genericEx() {
    val cleaner = TapWaterCleaner()
    val aquarium = Aquarium<TapWater>(TapWater())
    aquarium.hasWaterSupplyOfType<TapWater>() // True
    aquarium.waterSupply.isOfType<LakeWater>() // false
    aquarium.addWater(cleaner)
    addItemTo(aquarium)
    isWaterClean(aquarium)

    val cleaner2 = LakeWaterCleaner()
    val aquarium2 = Aquarium(LakeWater())
    aquarium2.hasWaterSupplyOfType<LakeWater>() // True
    aquarium2.waterSupply.isOfType<LakeWater>() // True
    aquarium2.addWater(cleaner2)
    addItemTo(aquarium2)
    isWaterClean(aquarium2)
}

