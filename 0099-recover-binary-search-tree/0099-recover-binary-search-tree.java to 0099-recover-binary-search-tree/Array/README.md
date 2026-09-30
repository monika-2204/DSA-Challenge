<h2><a href="https://leetcode.com/problems/recover-binary-search-tree">99. Recover Binary Search Tree</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given the root of a binary search tree (BST), where the values of exactly two nodes of the tree were swapped by mistake. Recover the tree without changing its structure.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">root = [1,3,null,null,2]</span></p>

<p><strong>Output:</strong> <span class="example-io">[3,1,null,null,2]</span></p>

<p><strong>Explanation:</strong></p>
<p>3 cannot be a left child of 1 because 3 &gt; 1. Swapping 1 and 3 makes the BST valid.</p>

<p><img alt="Example 1 Tree" src="https://assets.leetcode.com/uploads/2020/04/08/recover1.jpg" style="width: 200px; height: 200px;" /></p>
<p><img alt="Recovered Tree" src="https://assets.leetcode.com/uploads/2020/04/08/recover2.jpg" style="width: 200px; height: 200px;" /></p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">root = [3,1,4,null,null,2]</span></p>

<p><strong>Output:</strong> <span class="example-io">[2,1,4,null,null,3]</span></p>

<p><strong>Explanation:</strong></p>
<p>2 cannot be in the right subtree of 3 because 2 &lt; 3. Swapping 2 and 3 makes the BST valid.</p>
<p><img alt="" src="https://assets.leetcode.com/uploads/2024/08/29/tree_2.png" style="width: 350px; height: 286px;" /></p>

![Example 2 Tree](https://assets.leetcode.com/uploads/2020/04/08/recover3.jpg)
![Recovered Tree](https://assets.leetcode.com/uploads/2020/04/08/recover4.jpg)


</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
    <li>The number of nodes in the tree is in the range <code>[2, 1000]</code>.</li>
    <li><code>-2<sup>31</sup> &lt;= Node.val &lt;= 2<sup>31</sup> - 1</code></li>
</ul>

<p>&nbsp;</p>
<strong>Follow up:</strong> A solution using <code>O(n)</code> space is pretty straight-forward. Could you devise a constant <code>O(1)</code> space solution?
