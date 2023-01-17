package com.jktech.minend.registry;
import net.fabricmc.fabric.api.structure.v1.StructurePoolAddCallback;
import net.minecraft.structure.pool.StructurePool;
import net.minecraft.structure.pool.StructurePoolElement;
import net.minecraft.structure.processor.StructureProcessorLists;
import net.minecraft.util.Identifier;

public class buildings {
    public static void regedit(){
        StructurePoolAddCallback.EVENT.register(structurePool -> {
            System.out.println("!!!  [[ WOW!!! ]]  its registering!!!");

            switch (structurePool.getId().toString()){
                case "minecraft:village/desert/houses":
                    System.out.println("!!!  [[ WOW!!! ]] its "+
                            Identifier.isValid("minend:village/desert/houses/desert_block_trader")+" ");
                    structurePool.addStructurePoolElement(StructurePoolElement.ofProcessedLegacySingle(
                            "minend:village/desert/houses/desert_block_trader",
                                StructureProcessorLists.HOUSING).apply(
                                StructurePool.Projection.RIGID),108);
                    break;
                case "minecraft:village/taiga/houses":
                    structurePool.addStructurePoolElement(StructurePoolElement.ofProcessedLegacySingle(
                            "minend:village/taiga/houses",
                            StructureProcessorLists.HOUSING).apply(
                            StructurePool.Projection.RIGID),4);
                    break;
                case "minecraft:village/plains/houses":
                    System.out.println("!!!  [[ WOW!!! ]]  its registered!!!");
                    structurePool.addStructurePoolElement(StructurePoolElement.ofProcessedLegacySingle(
                            "minend:village/plains/houses",
                            StructureProcessorLists.HOUSING).apply(
                            StructurePool.Projection.RIGID),4);
                    break;
                case "minecraft:village/savanna/houses":
                    System.out.println("!!!  [[ WOW!!! ]]  its registered!!!");
                    structurePool.addStructurePoolElement(StructurePoolElement.ofProcessedLegacySingle(
                            "minend:village/savanna/houses",
                            StructureProcessorLists.HOUSING).apply(
                            StructurePool.Projection.RIGID),4);
                    break;
                case "minecraft:village/snowy/houses":
                    System.out.println("!!!  [[ WOW!!! ]]  its registered!!!");
                    structurePool.addStructurePoolElement(StructurePoolElement.ofProcessedLegacySingle(
                            "minend:village/snowy/houses",
                            StructureProcessorLists.HOUSING).apply(
                            StructurePool.Projection.RIGID),4);
                    break;
            }
        });
    }
}
