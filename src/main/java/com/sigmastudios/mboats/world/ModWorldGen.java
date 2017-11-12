package com.sigmastudios.mboats.world;

import com.sigmastudios.mboats.item.block.ModBlocks;
import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import java.util.Random;

public class ModWorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        int x = world.provider.getDimension();
        switch (x) {
            case 0:
                genOverworld(world, random, chunkX * 16, chunkZ * 16);
                break;

        }
    }
    private void genOverworld(World world, Random random, int chunkX, int chunkZ) {

        addOreSpawn(ModBlocks.boatOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 5, 4, 4, 20, BlockMatcher.forBlock(Blocks.STONE));
    }
    private void addOreSpawn(IBlockState block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chance, int minY, int maxY, Predicate<IBlockState> blockToSpawnIn) {
        int diffMinMaxY = maxY - minY;
        for (int x = 0; x < chance; x++)
        {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block, maxVeinSize, blockToSpawnIn)).generate(world, random, new BlockPos(posX, posY, posZ));
        }
    }
}
