                    j = j-1;                }            }        }    }    public List<List<Integer>> threeSum(int[] nums) {        Arrays.sort(nums);        List<List<Integer>> res = new ArrayList<>();        for(int f = 0; f<nums.length; f++){            if(nums[f]>0){                break;            }            if(f == 0 || nums[f] != nums[f-1]){                twoSum(f,nums,res);            }        }            return res;    }}                while(i<j && nums[j] == nums[j+1]){                }
                    j = j-1;
                }
            }
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int f = 0; f<nums.length; f++){
            if(nums[f]>0){
                break;
            }
            if(f == 0 || nums[f] != nums[f-1]){
                twoSum(f,nums,res);
            }
        }
            return res;
    }
}
                while(i<j && nums[j] == nums[j+1]){
                }

