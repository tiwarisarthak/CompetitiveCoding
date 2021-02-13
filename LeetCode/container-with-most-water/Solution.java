class Solution {
    public int maxArea(int[] height) {
			int maxArea = 0;
			for(int i=0;i<height.length;++i) {
				for(int j=i+1;j<height.length;++j) {
					if(height[i] > height[j]) {
						if(maxArea < height[j]*(j-i)) {
							maxArea = height[j]*(j-i);
						}
					}else {
						if(maxArea < height[i]*(j-i)) {
							maxArea = height[i]*(j-i);
						}
					}
				}
			}
			
			return maxArea;
		}
}