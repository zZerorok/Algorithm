class Solution {
    public int solution(int[][] sizes) {
        int height = 0;
        int Width = 0;

        for (int[] size : sizes) {
            Width = Math.max(Width, Math.max(size[0], size[1]));
            height = Math.max(height, Math.min(size[0], size[1]));
        }

        return Width * height;
    }
}